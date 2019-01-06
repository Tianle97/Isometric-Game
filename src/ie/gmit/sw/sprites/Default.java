package ie.gmit.sw.sprites;

import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Default extends Sprite {
    public Default(String name, Point p, GameAttr gameAttr) {
        super(name, p, gameAttr);
        try {
            super.setImages("default");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
