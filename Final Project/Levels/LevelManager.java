package Levels;
import main.Game;
import utilz.LoadSave;

import java.awt.*;
import java.awt.image.BufferedImage;


public class LevelManager {
    private Game game;
    private BufferedImage[] leveSprite;
    public LevelManager(Game game){
        this.game = game;
//        leveSprite = LoadSave.GetPlayerAboogRetep(LoadSave.LEVEL_ABMOOG_RETEP);
        importBse();

    }

    private void importBse() {
        leveSprite = new BufferedImage[];
    }

    public void draw(Graphics g) {
        g.drawImage(leveSprite,0,0,null);
    }
    public void update(){

    }

}
