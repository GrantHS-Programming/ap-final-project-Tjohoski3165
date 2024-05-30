package utilz;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;

public interface LoadSave {
    public static final String PLAYER_ABMOOG_RETEP = "images.jpeg";

    public static BufferedImage GetPlayerAboogRetep(String fileName){
        BufferedImage img = null;
        InputStream is = LoadSave.class.getResourceAsStream("/"+ fileName);
        try {
            img = ImageIO.read(is);
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            try{
                is.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return img;
    }


}
