package ie.gmit.sw.gameLogic;

import ie.gmit.sw.models.GameAttr;
import ie.gmit.sw.models.Point;

public class LifeControl implements GameLogic {
    /*
    if reach the box, then win
     */
    @Override
    public boolean triggetWin(GameAttr gameAttr, Point point) {
        switch (gameAttr.getGameLevel()){
            case 1:
                if (point.getX() == 5 && point.getY() == 6)  // this point is pre-defined according to the map
                    return true;
                break;
            case 2:
                if (point.getX() == 8 && point.getY() == 8)
                    return true;
                break;
        }
        return false;
    }

    @Override
    public boolean triggetDie(GameAttr gameAttr, Point point) {
        switch (gameAttr.getGameLevel()){
            case 1:
                if (point.getX() == 9 && point.getY() == 2)  // this point is pre-defined according to the map
                    return true;
                break;
            case 2:
                if (point.getX() == 6 && point.getY() == 9)
                    return true;
                break;
        }
        return false;
    }
}
