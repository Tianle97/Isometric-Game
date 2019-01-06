package ie.gmit.sw.sprites;

import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Green extends Sprite{

    public Green(String name, Point p) {
        super(name, p);
        try {
            super.setImages("green");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
