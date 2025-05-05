import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CPSTest extends JFrame{
    JLabel label = new JLabel("counter : 0");
    JButton button = new JButton("click");
    int counter = 0;

    public CPSTest() {
        button.addActionListener(e -> {
            counter++;
            label.setText("counter : " + counter);
        });

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CPSTest().setVisible(true);
        });
    }
}