import javax.swing.*;
import java.awt.*;

/**
 * Created by daniel on 11/25/15.
 */
public class CalculatorFrame extends JFrame
{
    private JPanel panel = new JPanel();
    private JTextField field = new JTextField("This is a text field!");

    public CalculatorFrame(String calculator)
    {
        this.setTitle(calculator);
        this.setVisible(true);
        this.setSize(500,500);
        //this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        panel.setBackground(Color.BLACK);
        panel.add(field);
        this.add(panel);
    }

}
