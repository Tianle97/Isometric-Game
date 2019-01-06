package ie.gmit.sw.GameViewModels;

/*
 * concrete gameWindow, use singleton design pattern
 */
public class GameViewModelTwo extends GameViewModel{
    // singleton design pattern
    private static GameViewModelTwo instance;
    protected GameViewModelTwo(){
        model = new int[][]{
                { 1, 1, 0, 0, 0, 3 , 3, 4, 4, 4},
                { 0, 1, 1, 0, 0, 3 , 3, 4, 4, 4},
                { 0, 0, 2, 2, 0, 3 , 3, 4, 4, 4},
                { 0, 0, 0, 2, 2, 0 , 3, 4, 4, 4},
                { 0, 0, 0, 0, 2, 1 , 0, 3, 4, 4},
                { 0, 0, 0, 0, 0, 2 , 1, 3, 4, 4},
                { 0, 0, 0, 0, 0, 2 , 1, 3, 4, 4},
                { 0, 0, 0, 0, 0, 0 , 1, 0, 3, 4},
                { 0, 0, 0, 0, 0, 0 , 1, 6, 3, 3},
                { 0, 0, 0, 0, 0, 0 , 1, 3, 3, 3}
        };

        objects = new int[][]{
                { 0, 0, 5, 5, 5, 0 , 0, 0, 0, 0},
                { 5, 0, 0, 0, 5, 0 , 0, 0, 0, 0},
                { 5, 5, 0, 0, 0, 0 , 0, 0, 0, 0},
                { 5, 5, 2, 0, 0, 0 , 0, 0, 0, 0},
                { 5, 5, 5, 0, 0, 0 , 0, 0, 0, 0},
                { 5, 5, 5, 5, 0, 0 , 0, 0, 0, 0},
                { 5, 5, 5, 5, 5, 0 , 0, 0, 0, 0},
                { 5, 5, 5, 5, 5, 0 , 0, 0, 0, 0},
                { 5, 5, 5, 5, 5, 0 , 0, 0, 3, 0},
                { 5, 5, 5, 5, 5, 0 , 9, 0, 0, 0}
        };
    }
    public static GameViewModel getInstance(){
        if (instance == null) return new GameViewModelTwo();
        else return instance;
    }
}
