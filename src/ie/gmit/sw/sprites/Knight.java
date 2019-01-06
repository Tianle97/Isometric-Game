package ie.gmit.sw.sprites;

import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Knight extends Sprite{

    public Knight(String name, Point p, GameAttr gameAttr) {
        super(name, p, gameAttr);
        try {
            super.setImages("knight");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
