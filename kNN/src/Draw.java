import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.setBackground(Color.white);
        graphics.setColor(Color.blue);
        for (int i = 0; i < kNN.rows; i++){
            graphics.fillRect(kNN.arrayCisel[i][0]*100,kNN.arrayCisel[i][1]*70,30,30);
        }
        graphics.setColor(Color.black);
        graphics.drawRect(1,1,980,658);
    }
}
