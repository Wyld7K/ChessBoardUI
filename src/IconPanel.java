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
    private ImageIcon img;

    public IconPanel() {
        img = new ImageIcon(IconPanel.class.getResource("wr.jpeg"));
        this.image = new BufferedImage(img.getIconWidth(),
                img.getIconHeight(),
                BufferedImage.TYPE_INT_RGB);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);

    }

}