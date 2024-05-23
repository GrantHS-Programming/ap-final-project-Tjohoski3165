package main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static utilz.Constants.Directions.*;
public class GamePanel extends JPanel {

    private float xDelta = 300, yDelta = 100;
    private int frames = 0;
    private long lastCheck =0;
    private Color color = new Color(0,0,0);
    private final Random random;
    private int playerDir = -1;




    public GamePanel(){
        random = new Random();
        MouseInputs mouseInputs = new MouseInputs();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void setMoving(int direction){

    }




    public void paintComponent(Graphics g){
        super.paintComponent(g);
        updateChar();

        g.setColor(color);
        g.fillRect((int) xDelta,(int) yDelta, 100, 175);


    }
    public void updateChar(){


    }

    private Color getRanColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r,g,b);
    }

    public void updateGame() {


    }
}
