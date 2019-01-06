package ie.gmit.sw.sprites;

import ie.gmit.sw.models.Point;

/*
 * generate sprites, use factory design pattern
 */
public class SpriteFactory {
    public static Sprite getDefault (String name, Point p) {
        Sprite sprite = new Default(name, p);
        return sprite;
    }

    public static Sprite getGreen (String name, Point p) {
        Sprite sprite = new Green(name, p);
        return sprite;
    }

    public static Sprite getKnight (String name, Point p) {
        Sprite sprite = new Knight(name, p);
        return sprite;
    }

    public static Sprite getPerson (String name, Point p) {
        Sprite sprite = new Person(name, p);
        return sprite;
    }
}
