import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
        private JTextField name;           // User name input
        private JTextField email;          // User email input
        private JPasswordField password;   // Password input
        private JRadioButton rbMale, rbFemale;  // Gender selection
        private JCheckBox cbJava, cbPython, cbCpp;  // Interests selection
        private JButton btnSubmit;            // Submit form button
    private GridBagConstraints gbc;// Layout constraints

    public Registration() {
        setTitle("User Registration");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0: Name label & field
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridx = 1;
        name = new JTextField(20);
        panel.add(name, gbc);

        // Row 1: Email label & field
        gbc.gridx = 0; gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        email = new JTextField(20);
        panel.add(email, gbc);

        // Row 2: Password label & field
        gbc.gridx = 0; gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        password = new JPasswordField(20);
        panel.add(password, gbc);

        // Row 3: Gender selection
        gbc.gridx = 0; gbc.gridy = 3;
        panel.add(new JLabel("Gender:"), gbc);
        gbc.gridx = 1;
        rbMale = new JRadioButton("Male"); rbFemale = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup(); bg.add(rbMale); bg.add(rbFemale);
        JPanel genderPanel = new JPanel(); genderPanel.add(rbMale); genderPanel.add(rbFemale);
        panel.add(genderPanel, gbc);

        // Row 4: Interests selection
        gbc.gridx = 0; gbc.gridy = 4;
        panel.add(new JLabel("Interests:"), gbc);
        gbc.gridx = 1;
        cbJava = new JCheckBox("Java"); cbPython = new JCheckBox("Python"); cbCpp = new JCheckBox("C++");
        JPanel interestPanel = new JPanel();
        interestPanel.add(cbJava); interestPanel.add(cbPython); interestPanel.add(cbCpp);
        panel.add(interestPanel, gbc);

        // Row 5: Submit button
        gbc.gridx = 1; gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.CENTER;
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener((ActionListener) this);
        panel.add(btnSubmit, gbc);

        add(panel);
    }

    public static void main(String[] args) {
        Registration reg = new Registration();
        SwingUtilities.invokeLater( () -> {
            reg.setSize(400, 500);
            reg.setDefaultCloseOperation(EXIT_ON_CLOSE);
            reg.setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String paneName = name.getText();
        String paneEmail = email.getText();
        String gender = rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Unspecified";
        String interests = "";
        if (cbJava.isSelected()) interests += "Java ";
        if (cbPython.isSelected()) interests += "Python ";
        if (cbCpp.isSelected()) interests += "C++ ";

        JOptionPane.showMessageDialog(this,
                "Name: " + paneName + "\n" +
                        "Email: " + paneEmail + "\n" +
                        "Gender: " + gender + "\n" +
                        "Interests: " + interests,
                "Registration Details", JOptionPane.INFORMATION_MESSAGE);
    }
}