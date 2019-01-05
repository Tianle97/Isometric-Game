package ie.gmit.sw.sprites;

import ie.gmit.sw.BufferedImgReader;
import ie.gmit.sw.Point;

import java.awt.image.BufferedImage;

/*
 * concrete sprite
 */
public class Default extends Sprite {
    private BufferedImage[][] images = new BufferedImage[4][3];
    private BufferedImgReader imgReader = (BufferedImgReader) BufferedImgReader.getInstance();

    public Default(String name, Point p) {
        super(name, p);
        try {
            super.setImages(getImg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Default(String name, Point p, BufferedImage[] img) {
        super(name, p, img);
    }

    public BufferedImage[][] getImg() throws Exception{
        BufferedImage[] img = imgReader.loadBufferedImages("./resources/images/sprites/default", null);
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
        return images;
    }

}
