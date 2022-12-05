import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Create an image and handle printing the image on the screen
 */
public class IconPanel extends JPanel {

    private BufferedImage image;
    private String imgSrc;

    /**
     * Creates Buffered Image
     *
     * @param g      Graphics
     * @param imgSrc Image Source path
     */
    public IconPanel(Graphics g, String imgSrc) {
        createImage(imgSrc);
    }

    /**
     * Make image variable and save it in the class
     *
     * @param imgSrc
     */
    private void createImage(String imgSrc) {
        // Make sure image isn't null
        if (imgSrc.equalsIgnoreCase("NULL"))
            return;
        this.imgSrc = imgSrc;

        try {
            image = ImageIO.read(new File(imgSrc));

        } catch (IOException ignored) {
        }
    }

    /**
     * Print image on screen at a given location (If image is not null)
     *
     * @param g    Graphics
     * @param xPos X position on the screen
     * @param yPos Y Position on the screen
     * @return IconPanel Object
     */
    public IconPanel printImg(Graphics g, int xPos, int yPos) {
        if (image == null) return this;
        g.drawImage(image, xPos + 5, yPos, 100, 100, this);
        return this;
    }

    /**
     * Get used Image
     *
     * @return Buffered image or null
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Get Image source
     *
     * @return Image path as a String or "NULL"
     */
    public String getImgSrc() {
        return imgSrc;
    }
}