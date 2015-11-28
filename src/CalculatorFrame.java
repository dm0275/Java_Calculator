import javax.swing.*;
import java.awt.*;

/**
 * Created by daniel on 11/25/15.
 */
public class CalculatorFrame extends JFrame
{
    private JPanel panel = new JPanel();
    private JTextField field = new JTextField("");

    public CalculatorFrame(String calculator)
    {
        this.setTitle(calculator);
        this.setVisible(true);
        this.setSize(500,500);
        //this.getContentPane().setBackground(Color.BLACK);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //panel.setBackground(Color.BLACK);
        field.setEditable(true);
        field.setColumns(10);
        field.setDocument(new JTextFieldLimit(10));
        panel.add(field);
        this.add(panel);
    }

}
