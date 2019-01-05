package ie.gmit.sw;

/*
 * concrete gameWindow, use singleton design pattern
 */
public class GameViewModelOne extends GameViewModel{
    // singleton design pattern
    private static GameViewModelOne instance;
    protected GameViewModelOne(){
        model = new int[][]{
                { 1, 0, 0, 0, 0, 0 , 0, 0, 0, 2},
                { 0, 1, 0, 0, 0, 0 , 0, 0, 0, 2},
                { 0, 0, 2, 0, 0, 0 , 0, 0, 0, 2},
                { 0, 0, 0, 1, 0, 0 , 0, 0, 0, 2},
                { 2, 2, 2, 2, 1, 0 , 0, 0, 0, 2},
                { 3, 3, 3, 3, 1, 1 , 1, 0, 0, 1},
                { 5, 5, 5, 5, 3, 3 , 1, 0, 0, 1},
                { 4, 4, 4, 5, 3, 3 , 1, 0, 0, 0},
                { 4, 4, 4, 4, 5, 3 , 1, 6, 6, 6},
                { 4, 4, 4, 4, 4, 3 , 1, 7, 7, 7}
        };

        objects = new int[][]{
                { 0, 0, 0, 5, 5, 5 , 5, 5, 5, 0},
                { 5, 0, 0, 0, 5, 5 , 5, 5, 5, 0},
                { 5, 5, 0, 0, 0, 5 , 5, 5, 5, 9},
                { 5, 5, 2, 0, 0, 0 , 5, 5, 5, 0},
                { 0, 0, 0, 0, 0, 0 , 0, 5, 5, 0},
                { 0, 0, 0, 0, 0, 0 , 0, 0, 5, 0},
                { 0, 0, 0, 0, 0, 3 , 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
                { 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0}
        };
    }
    public static GameViewModel getInstance(){
        if (instance == null) return new GameViewModelOne();
        else return instance;
    }
}
