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
    private int frames = 0;
    private long lastCheck =0;




    public GamePanel(){

        mouseInputs = new MouseInputs();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }



    public void changeXDelta(int val){
        this.xDelta += val;
    }
    public void changeYDelta(int val){
        this.yDelta += val;
    }




    public void paintComponent(Graphics g){
        super.paintComponent(g);


        g.fillRect(100 + xDelta,100 +yDelta,100,175);
        repaint();

        frames++;
        if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames=0;
        }
    }
    public void updateChar(){
        xDelta++;
        yDelta++;
    }

}
