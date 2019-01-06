package ie.gmit.sw.models;

public enum GameLevel {
    GameViewModelOne (1),
    GameViewModelTwo (2);

    private final int gameLevel;

    private GameLevel(int gameLevel) {
        this.gameLevel = gameLevel;
    }

    public int getGameLevel() {
        return this.gameLevel;
    }

}
