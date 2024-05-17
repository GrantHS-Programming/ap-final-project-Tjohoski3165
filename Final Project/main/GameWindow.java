package main;
import javax.swing.JFrame;
public class GameWindow {
    private JFrame jFrame;
    public GameWindow(GamePanel screen){

        jFrame = new JFrame();

        jFrame.setSize(1200,1920);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(screen);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
