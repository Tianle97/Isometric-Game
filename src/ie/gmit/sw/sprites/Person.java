package ie.gmit.sw.sprites;

import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

/*
 * concrete sprite
 */
public class Person extends Sprite{

    public Person(String name, Point p, GameAttr gameAttr) {
        super(name, p, gameAttr);
        try {
            super.setImages("person");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
