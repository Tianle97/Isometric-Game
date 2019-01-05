package ie.gmit.sw.GameViewModels;
/*
 * factory design pattern
 * return different gameWindow
 */
public class GameViewModelFactory {

    public static GameViewModel createGameViewOne() {
        return GameViewModelOne.getInstance();
    }

    public static GameViewModel createGameViewTwo() {
        return GameViewModelTwo.getInstance();
    }
}
