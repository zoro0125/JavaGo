package com.cyl.chapter16.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author cyl
 * @version 1.0
 */

public class BallMove extends JFrame{
    MyPanel myPanel = null;
    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(800, 600);
        this.addKeyListener(myPanel);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20 ,20);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            y-=3;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            y-=3;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            x-=3;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            x+=3;
        }
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}