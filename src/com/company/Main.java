package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main extends JPanel {
    ArrayList<cell> mass = new ArrayList<>();
    Main () {
        JFrame fr = new JFrame("paint");
        fr.add(this);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.getContentPane().add(new Main());
        fr.setSize(1000,1000);
        fr.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mass.add(new cell(e.getX(),e.getY()));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        repaint();
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(mass.get(mass.size() - 1).x,mass.get(mass.size() - 1).y,10,10);
    }
}
