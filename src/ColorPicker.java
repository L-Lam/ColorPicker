import javax.swing.*;
import java.awt.*;

public class ColorPicker extends JFrame {
    public ColorPicker(){
        JPanel mainContent = new JPanel();

        this.setSize(800,600);
        this.setVisible(true);
        this.setTitle("Top Text");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(128,50,128));

       	// We'll come back to this later
        // ColorPanel color = new ColorPanel();
        // ButtonPanel buttons = new ButtonPanel(color);
        // mainContent.add(color);
        // mainContent.add(buttons);

        this.add(mainContent);
   } 
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> new ColorPicker());
    }
}
