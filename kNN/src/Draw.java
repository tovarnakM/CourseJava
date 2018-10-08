import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        graphics.drawRect(1,1,980,658);
        graphics.setColor(Color.black);
        for (int i = 0; i < kNN.rows; i++){
            int x = Integer.parseInt((String) kNN.data[i][1]);
            int y = Integer.parseInt((String) kNN.data[i][2]);
            String CLASS = (String) kNN.data[i][3];
                if (CLASS.equals("Bad")) {
                    graphics.setColor(Color.red);
                    graphics.fillRect(x * 100, y * 70, 30, 30);
                }
                if (CLASS.equals("Good")) {
                    graphics.setColor(Color.green);
                    graphics.fillRect(x * 100, y * 70, 30, 30);
            }
        }
    }
}
