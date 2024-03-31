package com.cyl.tankwar.drawtank;

/**
 * @author cyl
 * @version 1.0
 */

public class MyTank extends Tank{

    Bullet bullet = null;
    public MyTank(int x, int y) {
        super(x, y);
    }
    public MyTank(int x, int y, int speed) {
        super(x, y, speed);
    }

    public void shut() {
        switch (this.getDirect()) {
            case 0:
                bullet = new Bullet(this.getX() + 20, this.getY(), 0);
                break;
            case 1:
                bullet = new Bullet(this.getX() + 20, this.getY() + 60, 1);
                break;
            case 2:
                bullet = new Bullet(this.getX() - 10, this.getY() + 30, 2);
                break;
            case 3:
                bullet = new Bullet(this.getX() + 50, this.getY() + 30, 3);
                break;
        }
        new Thread(bullet).start();
    }


}
