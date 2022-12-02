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
    private String imgSrc;

    public IconPanel(Graphics g, String imgSrc) {
        pasteImage(imgSrc);
    }

    private void pasteImage(String imgSrc) {
        if (imgSrc.equalsIgnoreCase("NULL"))
            return;
        this.imgSrc = imgSrc;

        try {
            image = ImageIO.read(new File(imgSrc));

        } catch (IOException e) {
            // // TODO Auto-generated catch block

            System.out.println(imgSrc);
        }
    }

    public IconPanel printImg(Graphics g, int xPos, int yPos) {

        g.drawImage(image, xPos + 5, yPos, 100, 100, this);
        return this;
    }

}