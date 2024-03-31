package com.cyl.tankwar.drawtank;

/**
 * @author cyl
 * @version 1.0
 */

public class Tank {

    private int x;
    private int y;
    private int direct;
    private int speed = 3;

    boolean isLive = true;


    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public Tank(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y -= speed;
    }
    public void moveDown() {
        y += speed;
    }
    public void moveRight() {
        x -= speed;
    }
    public void moveLeft() {
        x += speed;
    }

}
