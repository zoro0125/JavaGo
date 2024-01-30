package com.cyl.chapter16.draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author cyl
 * @version 1.0
 */

public class DrawCircle extends JFrame {
    private MyPanel mp = null;
    public static void main(String[] args) {
        System.out.println("111");
        new DrawCircle();
    }
    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(101, 101, 100, 100);
    }
}