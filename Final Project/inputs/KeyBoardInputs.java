package inputs;

import main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyBoardInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;

    }
    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
//        switch (e.getKeyCode()){
//            case KeyEvent.VK_SPACE:
//
//                gamePanel.changeMomentum(-25);
//
//
//
//
//
//                break;
//            case KeyEvent.VK_A:
//                gamePanel.changeXMomentum(-5);
//
//
//
//
//                break;
//            case KeyEvent.VK_D:
//                gamePanel.changeXMomentum(+5);
//
//
//
//
//                break;
//        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
