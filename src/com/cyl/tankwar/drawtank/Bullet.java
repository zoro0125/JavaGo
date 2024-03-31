package com.cyl.tankwar.drawtank;

/**
 * @author cyl
 * @version 1.0
 */

public class Bullet implements Runnable{

    int x;
    int y;
    int direct;
    int speed = 5;

    boolean isLive = true;

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (direct) {
                case 0 :
                    y -= speed;
                    break;
                case 1 :
                    y += speed;
                    break;
                case 2 :
                    x -= speed;
                    break;
                case 3 :
                    x += speed;
                    break;
            }

            if ( !(x >= 0 && x <= 1000 && y >= 0 && y <= 1000 && isLive) ) {
                isLive = false;
                break;
            }
            System.out.println(x + " " + y);
        }

    }
}
