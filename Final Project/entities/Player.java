package entities;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;
import utilz.LoadSave;

import java.awt.Dimension;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static utilz.Constants.Directions.*;
public class Player extends Entity{
    private BufferedImage img = LoadSave.GetPlayerAboogRetep(LoadSave.PLAYER_ABMOOG_RETEP);
    private boolean left,up,right,down;
    private boolean moving = false;
    private float playerSpeed = 2.0F;

    public boolean getMoving(){
        return moving;
    }

    public Player(float x, float y) {
        super(x, y);
    }


    private void importImg(){
        InputStream is = getClass().getResourceAsStream("/images.jpeg");

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

    public void updateChar(){
        moving = false;
        if(left && !right){
            x-= playerSpeed;
            moving = true;
        }else if(right && !left){
            x+= playerSpeed;
            moving = true;
        }


        if(up && !down){
            y-= playerSpeed;
            moving = true;
        }else if(down && !up){
            y+= playerSpeed;
            moving = true;
        }

    }


    public boolean isLeft() {
        return left;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setRight(boolean right) {
        this.right = right;
    }
}
