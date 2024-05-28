package main;
import javax.swing.JFrame;
public class GameWindow {
    private JFrame jFrame;
    public GameWindow(GamePanel screen){

        jFrame = new JFrame();

        jFrame.setSize(1100,1200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(screen);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
