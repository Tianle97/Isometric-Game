package ie.gmit.sw.sprites;

import ie.gmit.sw.Point;

/*
 * generate sprites, use factory design pattern
 */
public class SpriteFactory {
    public static Sprite getDefault (String name, Point p) {
        Sprite sprite = new Default(name, p);
        return sprite;
    }
}
