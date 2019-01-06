package ie.gmit.sw.sprites;

import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Knight extends Sprite{

    public Knight(String name, Point p) {
        super(name, p);
        try {
            super.setImages("knight");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
