import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterPanel extends JPanel {
    public RegisterPanel(JFrame frame, int width) {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        // font-size
        Font font = new Font("Arial", Font.PLAIN, width/40);
        
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);
        frame.setTitle("Register Form"); // set title here
        
        // add components for registration screen here
        // email
        constraints.gridx = 0;
        constraints.gridy = 0;
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(font);
        frame.add(emailLabel, constraints);

        constraints.gridx = 1;
        JTextField emailField = new JTextField(10);
        emailField.setFont(font);
        frame.add(emailField, constraints);
        
        // username
        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(font);
        frame.add(usernameLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        JTextField usernameField = new JTextField(10);
        usernameField.setFont(font);
        frame.add(usernameField, constraints);
        
        // password
        constraints.gridx = 0;
        constraints.gridy = 2;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(font);
        frame.add(passwordLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setFont(font);
        frame.add(passwordField, constraints);
        
        // register button
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        JButton RegisterButton = new JButton("Register");
        RegisterButton.setFont(font);
        frame.add(RegisterButton, constraints);
        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display login screen
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                
                //todo: logic for adding new user
                System.out.println();
                
            }
        });
        
        // create return login button
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        JButton returnLoginButton = new JButton("Return to Login");
        returnLoginButton.setFont(font);
        frame.add(returnLoginButton, constraints);
        // add action listener to return login button
        returnLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display login screen
                frame.getContentPane().removeAll();
                new LoginPanel(frame, width);
                frame.revalidate();
                frame.repaint();
            }
        });
    }
}