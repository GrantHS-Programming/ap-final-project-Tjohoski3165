package main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {
    private float xDelta = 300, yDelta = 100;
    private float xDir = 1, yDir = 1;
    private int frames = 0;
    private long lastCheck =0;
    private Color color = new Color(0,0,0);
    private final Random random;




    public GamePanel(){
        random = new Random();
        MouseInputs mouseInputs = new MouseInputs();
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
        updateChar();


        g.setColor(color);
        g.fillRect((int) xDelta,(int) yDelta, 100, 175);


        frames++;
        if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("FPS: " + frames);
            frames=0;
        }
    }
    public void updateChar(){
        xDelta+= xDir;
        if(xDelta > 1000|| xDelta < 0){
            xDir*=-1;
            color = getRanColor();
        }
        yDelta+= yDir;
        if(yDelta > 1000 || yDelta < 0){
            yDir *= -1;
            color = getRanColor();
        }
    }

    private Color getRanColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r,g,b);
    }

}
