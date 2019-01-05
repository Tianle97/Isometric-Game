package ie.gmit.sw;
/*
 * factory design pattern
 * return different gameWindow
 */
public class GameWindowFactory {

    public static GameViewModel createGameViewOne() {
        return GameViewModelOne.getInstance();
    }

    public static GameViewModel createGameViewTwo() {
        return GameViewModelTwo.getInstance();
    }
}
