package com.cyl.chapter16.tankgame;

/**
 * @author cyl
 * @version 1.0
 */

public class Tank {
    private int x;
    private int y;

    private int direction;
    private int type;

    public Tank(int x, int y, int direction, int type) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.type = type;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
