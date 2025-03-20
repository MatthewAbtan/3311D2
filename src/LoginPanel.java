import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;

public class LoginPanel extends JPanel {

    private JComboBox<String> userTypeDropdown;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton submitButton;
    private JButton switchModeButton;
    private JLabel modeLabel;
    private JLabel dropdownLabel;
    private JLabel actionMessage;
    private boolean isRegisterMode = false;
    private Consumer<String> switchTo;

    public LoginPanel(Consumer<String> switchTo) {
        //method for switching panels
        this.switchTo = switchTo;
        // main layout, using box to center everything vertically
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.LIGHT_GRAY);

        // used for making space at the top
        add(Box.createVerticalGlue());

        // text at the top that indicates login/register
        modeLabel = new JLabel("Login", JLabel.CENTER);
        modeLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        modeLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(modeLabel);

        // spacing
        add(Box.createVerticalStrut(20));

        // label above the dropdown indicating contents
        dropdownLabel = new JLabel("Select Login Type:");
        dropdownLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        dropdownLabel.setAlignmentX(CENTER_ALIGNMENT);
        add(dropdownLabel);

        // dropdown for user/manger login types
        userTypeDropdown = new JComboBox<>(new String[]{"User", "Manager"});
        userTypeDropdown.setMaximumSize(new Dimension(300, 30));
        userTypeDropdown.setAlignmentX(CENTER_ALIGNMENT);
        add(userTypeDropdown);

        // spacing
        add(Box.createVerticalStrut(20));

        // username field
        usernameField = new JTextField(15);
        usernameField.setMaximumSize(new Dimension(300, 30));
        usernameField.setAlignmentX(CENTER_ALIGNMENT);
        usernameField.setBorder(BorderFactory.createTitledBorder("Username"));
        add(usernameField);

        // spacing
        add(Box.createVerticalStrut(20));

        // password field
        passwordField = new JPasswordField(15);
        passwordField.setMaximumSize(new Dimension(300, 30));
        passwordField.setAlignmentX(CENTER_ALIGNMENT);
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));
        add(passwordField);

        // spacing
        add(Box.createVerticalStrut(20));

        // submit button
        submitButton = new JButton("Submit");
        submitButton.setMaximumSize(new Dimension(200, 40));
        submitButton.setAlignmentX(CENTER_ALIGNMENT);
        add(submitButton);

        // spacing
        add(Box.createVerticalStrut(20));

        // button that lets you switch between login/register
        switchModeButton = new JButton("Switch to Register");
        switchModeButton.setMaximumSize(new Dimension(300, 40));
        switchModeButton.setAlignmentX(CENTER_ALIGNMENT);
        add(switchModeButton);

        // spacing
        add(Box.createVerticalStrut(10));

        // bottom label that displays success or failure of login or register
        actionMessage = new JLabel("", JLabel.CENTER);
        actionMessage.setFont(new Font("SansSerif", Font.BOLD, 14));
        actionMessage.setAlignmentX(CENTER_ALIGNMENT);
        actionMessage.setForeground(new Color(0, 128, 0)); // Green text for success
        actionMessage.setVisible(false); // Initially hidden
        add(actionMessage);

        // used for making space at the bottom
        add(Box.createVerticalGlue());

        // action listeners for the buttons
        switchModeButton.addActionListener(new SwitchModeListener());
        submitButton.addActionListener(new SubmitButtonListener());
    }

    // action listener for the switching to login/register
    private class SwitchModeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) { //this triggers when button is clicked
            isRegisterMode = !isRegisterMode; // switch the mode

            if (isRegisterMode) {
                // switch to register mode
                modeLabel.setText("Register");
                dropdownLabel.setText("Select User Type:");
                userTypeDropdown.setModel(new DefaultComboBoxModel<>(new String[]{"Student", "Faculty Member", "Non-Faculty Staff", "Visitor"}));
                switchModeButton.setText("Switch to Login");
            } else {
                // switch to login mode
                modeLabel.setText("Login");
                dropdownLabel.setText("Select Login Type:");
                userTypeDropdown.setModel(new DefaultComboBoxModel<>(new String[]{"User", "Manager"}));
                switchModeButton.setText("Switch to Register");
            }

            // Hide the success message whenever the mode changes
            actionMessage.setVisible(false);
        }
    }

    // action listener for submit button; will add logic later when classes are made
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isRegisterMode) {
                // Simulate account creation success
                actionMessage.setText("ACCOUNT CREATION SUCCESS(will add it to a database later)");
            } else {
                // Simulate login success
                switchTo.accept("UserDashboard");
                if (userTypeDropdown.getSelectedItem().equals("Manager")) {
                    switchTo.accept("ManagementDashboard");
                }
            }

            // Show the message below the toggle button
            actionMessage.setVisible(true);
        }
    }

}