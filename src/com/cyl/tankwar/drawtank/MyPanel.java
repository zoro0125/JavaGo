package com.cyl.tankwar.drawtank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author cyl
 * @version 1.0
 */

public class MyPanel extends JPanel implements KeyListener, Runnable{

    MyTank myTank = null;
    Vector<EnemyTank> enemies = new Vector<>();
    int enemySize = 3;

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        g.fillRect(0, 0, 1000, 1000);
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        for (EnemyTank enemy : enemies) {
            if (enemy.isLive) {
                drawTank(enemy.getX(), enemy.getY(), g, 1, 1);
                for (Bullet bullet : enemy.bullets) {
                    if (bullet.isLive) {
                        drawBullet(bullet.x, bullet.y, g);
                    } else {
                        enemy.bullets.remove(bullet);
                    }
                }
            }

        }

        if (myTank.bullet != null && myTank.bullet.isLive) {
            drawBullet(myTank.bullet.x, myTank.bullet.y, g);
        }

    }
    public MyPanel() {
        myTank = new MyTank(100, 200, 0);
        for (int i = 0; i < enemySize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 100, 1);
            Bullet bullet = new Bullet(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            enemyTank.bullets.add(bullet);
            new Thread(bullet).start();
            enemies.add(enemyTank);
        }
    }
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.YELLOW);
                break;
        }
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y, x + 20, y + 30);
                break;
            case 1:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 60, x + 20, y + 30);
                break;
            case 2:
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x - 10, y + 30);
                break;
            case 3:
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 50, y + 30);
                break;
        }

    }
    public void drawBullet(int x, int y, Graphics g) {
        g.draw3DRect(x, y, 2, 2, false);

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirect(0);
            myTank.moveUp();
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(1);
            myTank.moveDown();
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(2);
            myTank.moveRight();
        }else if (keyEvent.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(3);
            myTank.moveLeft();
        }

        if (keyEvent.getKeyCode() == KeyEvent.VK_J) {
            myTank.shut();
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (myTank.bullet != null && myTank.bullet.isLive) {
                for (EnemyTank enemyTank : enemies) {
                    hitTank(myTank.bullet, enemyTank);
                }
            }

            this.repaint();
        }
    }

    public void hitTank(Bullet bullet, EnemyTank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 1:
                if ( (bullet.x > enemyTank.getX() && bullet.x < enemyTank.getX() + 40 && bullet.y > enemyTank.getY() && bullet.y < enemyTank.getY() + 60) ) {
                    bullet.isLive = false;
                    enemyTank.isLive = false;
                }
                break;
            case 2:
            case 3:
                if ( (bullet.x > enemyTank.getX() && bullet.x < enemyTank.getX() + 60 && bullet.y > enemyTank.getY() && bullet.y < enemyTank.getY() + 40) ) {
                    bullet.isLive = false;
                    enemyTank.isLive = false;
                }
                break;

        }

    }
}
