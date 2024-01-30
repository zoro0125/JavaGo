package com.cyl.chapter16.draw_;

import javax.swing.*;
import java.awt.*;

/**
 * @author cyl
 * @version 1.0
 */

public class DrawMethod extends JFrame {
    MyPanel01 mp = null;
    public static void main(String[] args) {
        new DrawMethod();
    }

    DrawMethod() {
        mp = new MyPanel01();
        this.add(mp);
        this.setSize(800, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel01 extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

//        g.drawOval(100, 100, 100, 100);

        g.drawLine(10, 10, 100, 100);
        g.drawRect(10, 10, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(100, 100, 200, 200);

    }
}
