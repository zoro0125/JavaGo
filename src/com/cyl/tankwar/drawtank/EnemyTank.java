package com.cyl.tankwar.drawtank;

import java.util.Vector;

/**
 * @author cyl
 * @version 1.0
 */

public class EnemyTank extends Tank{

    Vector<Bullet> bullets = new Vector<>();

    public EnemyTank(int x, int y, int direct) {
        super(x, y, direct);
    }

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
