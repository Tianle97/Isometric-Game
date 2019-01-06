package ie.gmit.sw.sprites;

import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Green extends Sprite{

    public Green(String name, Point p, GameAttr gameAttr) {
        super(name, p, gameAttr);
        try {
            super.setImages("green");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
