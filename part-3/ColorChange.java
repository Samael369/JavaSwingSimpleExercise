import javax.swing.*;
import java.awt.*;

public class ColorChange extends JFrame {
    JPanel btnPanel = new JPanel();
    JPanel colorPanel = new JPanel();
    JButton redButton = new JButton("Red");
    JButton blueButton = new JButton("Blue");
    JButton greenButton = new JButton("Green");

    public ColorChange() {
        redButton.addActionListener(e ->{
            colorPanel.setBackground(Color.RED);
        });
        blueButton.addActionListener(e ->{
            colorPanel.setBackground(Color.BLUE);
        });
        greenButton.addActionListener(e ->{
            colorPanel.setBackground(Color.GREEN);
        });

        btnPanel.add(redButton);
        btnPanel.add(blueButton);
        btnPanel.add(greenButton);
        add(btnPanel, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChange frame = new ColorChange();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setSize(500, 500);
        });
    }
}