package com.cyl.chapter16.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author cyl
 * @version 1.0
 */

public class MyPanel extends JPanel implements KeyListener {
    MyTank myTank = null;

    public MyPanel() {
        myTank = new MyTank(100, 100, 0, 0);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillRect(0, 0, 1000 ,800);
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirection(), myTank.getType());
//        drawTank(myTank.getX() + 50, myTank.getY(), g, 0, 1);

    }

    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.RED);
                break;
        }
        switch (direction) {
            case 0://up
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);
                break;
            case 1://down
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 60, x + 20, y + 30);
                break;
            case 2://left
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x - 10, y + 30);
                break;
            case 3://right
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 50, y + 30);
                break;
        }

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        int x = myTank.getX();;
        int y = myTank.getY();

        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            if (myTank.getDirection() != 0) {
                myTank.setDirection(0);
            }
            myTank.setY(--y);
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            if (myTank.getDirection() != 1) {
                myTank.setDirection(1);
            }
            myTank.setY(++y);
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            if (myTank.getDirection() != 2) {
                myTank.setDirection(2);
            }
            myTank.setX(--x);
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (myTank.getDirection() != 3) {
                myTank.setDirection(3);
            }
            myTank.setX(++x);
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
