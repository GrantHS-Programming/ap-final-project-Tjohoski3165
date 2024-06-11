package Levels;
import main.Game;
import utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;


public class LevelManager {
    private Game game;
    private BufferedImage[] leveSprite;


    public LevelManager(Game game){
        this.game = game;
//        leveSprite = LoadSave.GetPlayerAboogRetep(LoadSave.LEVEL_ABMOOG_RETEP);
        importSprites();

    }

    private void importSprites() {
        BufferedImage img = LoadSave.GetPlayerAboogRetep(LoadSave.LEVEL_ABMOOG_RETEP);
        leveSprite = new BufferedImage[4];
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2 ; i++) {
                int index = j * 2 + 1;
                leveSprite[index] = img.getSubimage(i * 32,j*32,32,32);
            }

        }
    }

    public void draw(Graphics g) {
        g.drawImage(leveSprite[1],0,0,null);
    }
    public void update(){

    }

}
