package main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import static utilz.Constants.Directions.*;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;
public class GamePanel extends JPanel {
    private int frames = 0;
    private long lastCheck =0;
    private Game game;



    public GamePanel(Game game){
        MouseInputs mouseInputs = new MouseInputs();
this.game = game;
        setPanelSize();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }


    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setPreferredSize(size);



    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);
    }


    public void updateGame() {
    }

    public Game getGame(){
        return game;
    }
}
