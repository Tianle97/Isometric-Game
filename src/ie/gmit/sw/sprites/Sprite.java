package ie.gmit.sw.sprites;

/*
 *   
 *   BufferedImage[][]
 *   --------------------------
 *   {U0, U1, U2, U3}, =>Up
 *   {D0, D1, D2, D3}, =>Down
 *   {L0, L1, L2, L3}, =>Left
 *   {R0, R1, R2, R3}, =>Right
 * 
 */

import ie.gmit.sw.BufferedImgReader;
import ie.gmit.sw.Direction;
import ie.gmit.sw.Point;

import java.awt.image.*;
public class Sprite { //Sprite belongs in some sort of hierarchy....
	public String name; //The name of the sprite
	public BufferedImage[][] images = new BufferedImage[4][3]; //The images used in the animation
	public Direction direction = Direction.DOWN; //The current orientation of the sprite
	public int index = 0; //The current image index.
	public Point position; //The current x, y position
	private BufferedImgReader imgReader = (BufferedImgReader) BufferedImgReader.getInstance();
	
	public Sprite(String name, Point p) {
		super();
		this.name = name;
		this.position = p;
	}

	public void setImages (BufferedImage[][] img){
		this.images = img;
	}

	public void setImages (String type) throws Exception{
		BufferedImage[] img = imgReader.loadBufferedImages("./resources/images/sprites/"+type, null);
		int row = 0, col = 0;
		for (int i = 0; i < img.length; i++) {
			images[row][col] = img[i];
			if (col == images[row].length - 1) {
				row++;
				col = 0;
			}else {
				col++;
			}
		}
	}
	
	public String getName() {
		return name;
	}

	public Point getPosition() {
		return position;
	}

	public BufferedImage getImage() {
		return images[direction.getOrientation()][index];
	}
	
	public BufferedImage step(Direction d) {
		setDirection(d);
		if (index < images[direction.getOrientation()].length - 1) {
			index++;
		}else {
			index = 0;
		}
		
		return images[d.getOrientation()][index];
	}
	
	public void setDirection(Direction d) {
		direction = d;
	}
	
    public Direction getDirection() {
        return this.direction;
    }
	
	public void move() { //This method is suspiciously like one I've seen already....
		step(direction);
		
		switch(direction.getOrientation()) {
		case 1:
			position.setY(position.getY() + 1); //UP
			break;
		case 2:
			position.setX(position.getX() - 1); //DOWN
			break;
		case 3:
			position.setX(position.getX() + 1); //LEFT
			break;
		default:
			position.setY(position.getY() - 1); //RIGHT
			break;
		}
	}
}