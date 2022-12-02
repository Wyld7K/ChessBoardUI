import java.awt.Color;
import java.util.ArrayList;
import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class App extends JFrame {

    // private ArrayList<String> imgSrcs = new ArrayList<String>({
    private List<IconPanel> icons = new ArrayList<>();
    // });

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

    public String getImgSrc(int row, int col) {
        // Array of paths
        switch (row) {
            case 0:
                if (col == 0)
                    return "Images/br.png";
                else if (col == 1)
                    return "Images/bn.png";
                else if (col == 2)
                    return "Images/bb.png";
                else if (col == 3)
                    return "Images/bq.png";
                else if (col == 4)
                    return "Images/bk.png";
                else if (col == 5)
                    return "Images/bb.png";
                else if (col == 6)
                    return "Images/bn.png";
                else if (col == 7)
                    return "Images/br.png";

            case 1:
                return "Images/bp.png";
            case 6:
                return "Images/wp.png";
            case 7:
                if (col == 0)
                    return "Images/wr.png";
                else if (col == 1)
                    return "Images/wn.png";
                else if (col == 2)
                    return "Images/wb.png";
                else if (col == 3)
                    return "Images/wq.png";
                else if (col == 4)
                    return "Images/wk.png";
                else if (col == 5)
                    return "Images/wb.png";
                else if (col == 6)
                    return "Images/wn.png";
                else if (col == 7)
                    return "Images/wr.png";

        }
        return "NULL";

    }

    void drawRectangles(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int xPos = 105;
        int yPos = 105;
        int cellGap = 105;
        int cellSize = 105;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                g2d.drawRect(xPos + row * cellGap, yPos + col * cellGap, cellSize, cellSize);

                if (row % 2 == 0) {
                    if (col % 2 != 0)
                        // Fill Black
                        g2d.fillRect(yPos + col * cellGap, xPos + row * cellGap, cellSize, cellSize);

                } else {
                    if (col % 2 == 0)
                        // Fill Black
                        g2d.fillRect(yPos + col * cellGap, xPos + row * cellGap, cellSize, cellSize);
                }

                icons.add(new IconPanel(g, getImgSrc(row, col)).printImg(g2d, yPos +
                        col * cellGap,
                        xPos + row * cellGap));

            }
            // DO SOMETHING HERE
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
