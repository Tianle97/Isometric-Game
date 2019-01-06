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

import ie.gmit.sw.GameWindow;
import ie.gmit.sw.gameLogic.GameLogic;
import ie.gmit.sw.gameLogic.LifeControl;
import ie.gmit.sw.imageReader.BufferedImgReader;
import ie.gmit.sw.models.Direction;
import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
public class Sprite { //Sprite belongs in some sort of hierarchy....
	private String name; //The name of the sprite
	private BufferedImage[][] images = new BufferedImage[4][3]; //The images used in the animation
	private Direction direction = Direction.DOWN; //The current orientation of the sprite
	private int index = 0; //The current image index.
	private Point position; //The current x, y position
	private BufferedImgReader imgReader = (BufferedImgReader) BufferedImgReader.getInstance();
	private GameAttr gameAttr;
	
	public Sprite(String name, Point p, GameAttr gameAttr) {
		super();
		this.name = name;
		this.position = p;
		this.gameAttr = gameAttr;
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

	public void setGameAttr(GameAttr gameAttr) {
		this.gameAttr = gameAttr;
	}

	public GameAttr getGameAttr() {
		return gameAttr;
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

		int posY = position.getY();
		int posX = position.getX();

		switch(direction.getOrientation()) {
		case 1:
			if (posY < 9)
				position.setY(posY + 1); //UP
			break;
		case 2:
			if (posX > 0)
				position.setX(posX - 1); //DOWN
			break;
		case 3:
			if (posX < 9)
				position.setX(posX + 1); //LEFT
			break;
		default:
			if (posY > 0)
				position.setY(posY - 1); //RIGHT
			break;
		}
		checkWin();
	}

	public void checkWin(){
		LifeControl lifeControl = new LifeControl();
		if (lifeControl.triggetWin(gameAttr,position)){
			gameWin();
		}
	}

	public void gameWin(){
		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("you Win !");
		JButton button = new JButton("restart");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					new GameWindow();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		f.add(label);
		f.add(button);
		f.setSize(300, 300);
		f.setLocation(100, 100);
		f.pack();
		f.setVisible(true);
	}

}