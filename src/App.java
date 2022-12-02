import java.awt.Color;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class App extends JFrame {

    public App() {
        getContentPane().setBackground(Color.WHITE);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        drawMovelList();

        // JImageComponent ic = new JImageComponent(myImageGoesHere);
        // imagePanel.add(ic);

    }

    public void drawMovelList() {

        // JPanel panel = new JPanel();

        // // adding a label element to the panel
        // JLabel label = new JLabel("HELLO I AM SUBHOJEET");
        // label.setBounds(700, 100, 200, 50);
        // panel.add(label);

        // // changing the background color of the panel to yellow
        // panel.setBackground(Color.yellow);

        // panel.setBounds(100, 100, 100, 200);
        // // adding the panel to the Container of the JFrame
        // add(panel);

    }

    void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int xPos = 105;
        int yPos = 105;
        int cellGap = 105;
        int cellSize = 105;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                {
                    g2d.drawRect(xPos + row * cellGap, yPos + col * cellGap, cellSize, cellSize);
                    // cc.paintComponent(g2d);
                    IconPanel icon = new IconPanel(g).printImg(g2d, xPos + row * cellGap, yPos + col * cellGap);

                    if (row % 2 == 0) {
                        if (col % 2 != 0)
                            g2d.fillRect(xPos + row * cellGap, yPos + col * cellGap, cellSize, cellSize);

                    } else {
                        if (col % 2 == 0)
                            g2d.fillRect(xPos + row * cellGap, yPos + col * cellGap, cellSize, cellSize);

                    }
                    // Change angle of drawing
                    // g2d.setColor(new Color(255, 255, 255));

                }
            }
        }

        // code to draw rectangles goes here...

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawRectangles(g);
    }

    // TODO: JPanel with movelist
    // TODO: JPanel with playerBox
    // TODO: Add Resign and offer-draw button
    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}
