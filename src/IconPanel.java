import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class IconPanel extends JPanel {

    private BufferedImage image;

    public IconPanel(Graphics g) {

        try {
            image = ImageIO.read(new File("src/bk.png"));

        } catch (IOException e) {
            // // TODO Auto-generated catch block

            e.printStackTrace();
        }

    }

    public IconPanel printImg(Graphics g, int xPos, int yPos) {
        g.drawImage(image, xPos, yPos, this);
        return this;
    }

}