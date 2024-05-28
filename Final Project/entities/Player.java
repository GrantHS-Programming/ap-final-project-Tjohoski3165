package entities;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static utilz.Constants.Directions.*;
public class Player extends Entity{
    private BufferedImage img;
    private int playerDir = -1;
    private boolean moving = false;

    public Player(float x, float y) {
        super(x, y);
    }
    private void importImg(){
        inputStream is = getClass().getResourceAsStream("/images.jpeg");

        try {
            img = ImageIO.read(is);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
        updateChar();
    }

    public void render(Graphics g){
        importImg();
        g.drawImage(img,(int) x, (int) y,null);

    }
    public void setDirection(int direction){
        this.playerDir = direction;
        moving = true;

    }
    public void setMoving(boolean moving){
        this.moving = moving;
    }
    public void updateChar(){
        if(moving){
            switch(playerDir){
                case LEFT:
                    x-=5;
                    break;
                case RIGHT:
                    x+=5;
                    break;
                case UP:
                    y-=5;
                    break;
                case DOWN:
                    y+=5;
                    break;


            }
        }

    }

}
