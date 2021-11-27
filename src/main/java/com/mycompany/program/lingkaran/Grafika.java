/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program.lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sulaeman
 */
public class Grafika extends JPanel {
 @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd = (Graphics2D) g;

        int r = 150;
        int d = (5 / 4) * r;
        int x = 0;
        int y = r;

        do {
            gd.setColor(Color.RED);
            gd.drawLine(y + 200, x + 200, y + 200, x + 200);
            gd.drawLine(x + 200, y + 200, x + 200, y + 200);
            gd.drawLine(x + 200, -y + 200, x + 200, -y + 200);
            gd.drawLine(y + 200, -x + 200, y + 200, -x + 200);
            gd.drawLine(-y + 200, -x + 200, -y + 200, -x + 200);
            gd.drawLine(-x + 200, -y + 200, -x + 200, -y + 200);
            gd.drawLine(-x + 200, y + 200, -x + 200, y + 200);
            gd.drawLine(-y + 200, x + 200, -y + 200, x + 200);

            if (d < 0) {
                d = d + 2 * x + 3;
            } else {
                d = d + 2 * (x - y) + 5;
                y = y - 1;
            }
            x = x + 1;
        } while (x < y);
    }

    public static void main(String[] args) {
        Grafika g = new Grafika();
        JFrame jf = new JFrame();
        jf.add(g);
        jf.setSize(600, 600);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
