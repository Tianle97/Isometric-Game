package ie.gmit.sw.sprites;

import ie.gmit.sw.Point;

/*
 * concrete sprite
 */
public class Person extends Sprite{

    public Person(String name, Point p) {
        super(name, p);
        try {
            super.setImages("person");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
