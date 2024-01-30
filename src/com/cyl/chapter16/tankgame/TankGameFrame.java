package com.cyl.chapter16.tankgame;

import javax.swing.*;

/**
 * @author cyl
 * @version 1.0
 */

public class TankGameFrame extends JFrame {

    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGameFrame();
    }
    public TankGameFrame() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 800);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
