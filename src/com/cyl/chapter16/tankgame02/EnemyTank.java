package com.cyl.chapter16.tankgame02;

/**
 * @author cyl
 * @version 1.0
 */

public class EnemyTank extends Tank{
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public EnemyTank(int x, int y, int direction, int type) {
        super(x, y, direction, type);
    }
}
