package ie.gmit.sw.models;

public enum GameSprite {
    DEFAULT (0),
    KNIGHT (1),
    GREEN (2),
    PERSON (3);

    private final int sprite;

    private GameSprite(int sprite) {
        this.sprite = sprite;
    }

    public int getSprite() {
        return this.sprite;
    }
}
