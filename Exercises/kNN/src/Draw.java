import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        graphics.drawRect(1,1,980,658);
        graphics.setColor(Color.black);
        int widthHeight = 10;
        for (int i = 0; i < kNN.rows; i++){
            int x = Integer.parseInt((String) kNN.data[i][1]);
            int y = Integer.parseInt((String) kNN.data[i][2]);
            String CLASS = (String) kNN.data[i][3];
                if (CLASS.equals("Bad")) {
                    graphics.setColor(Color.red);
                    graphics.fillRect(x*50-widthHeight/2, y*50-widthHeight/2, widthHeight, widthHeight);

                }
                if (CLASS.equals("Good")) {
                    graphics.setColor(Color.green);
                    graphics.fillRect(x * 50-widthHeight/2, y * 50-widthHeight/2, widthHeight, widthHeight);
            }
        }
        graphics.setColor(Color.black);
        graphics.fillRect(kNN.x*50-widthHeight/2, kNN.y*50-widthHeight/2,widthHeight,widthHeight);
        graphics.setColor(Color.black);
        graphics.drawOval((kNN.x*50-kNN.dist),(kNN.y*50-kNN.dist),kNN.dist*2,kNN.dist*2);

    }
}
