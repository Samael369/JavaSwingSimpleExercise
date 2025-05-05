import javax.swing.*;
import java.awt.*;

public class Greeting extends JFrame {
    JLabel label;
    JButton button = new JButton("Greet");
    JTextField textField;

    public Greeting() {
        JPanel panel = new JPanel();
        label = new JLabel("Enter your name and press Greet");
        textField = new JTextField(15);
        textField.setSize(100, 20);

        button.addActionListener(e -> {
            String name = textField.getText();
            String greeting = "Hello, " + name + "!";
            label.setText(greeting);
        });

        panel.add(new JLabel("Enter your name :"));
        panel.add(textField);
        panel.add(button);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.NORTH);
        add(label, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Greeting frame = new Greeting();
            frame.setSize(400, 150);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}