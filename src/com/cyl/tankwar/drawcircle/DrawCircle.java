package com.cyl.tankwar.drawcircle;

import javax.swing.*;
import java.awt.*;

/**
 * @author cyl
 * @version 1.0
 */

public class DrawCircle extends JFrame{

    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();


    }
    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

//定义一个画板
class MyPanel extends JPanel {


    //窗口最大化 最小化 窗口repainr时被调用
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawOval(100, 100, 200, 200);

    }
}
