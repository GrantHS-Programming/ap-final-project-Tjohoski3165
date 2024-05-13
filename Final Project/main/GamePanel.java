package main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;
    private int xDelta = 0, yDelta = 0;
    public GamePanel(){

        mouseInputs = new MouseInputs();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }
    public void changeXDelta(int val){
        this.xDelta += val;
        repaint();
    }
    public void changeYDelta(int val){
        this.yDelta += val;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100 + xDelta,100 +yDelta,100,175);

    }
}
