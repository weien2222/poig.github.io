
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPanel {
    
    public LoginPanel(JFrame frame, int width){
        frame.setTitle("Login Form"); // set title here
        frame.setLayout(new GridBagLayout());
        // font-size
        Font font = new Font("Arial", Font.PLAIN, width/40);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(font);
        frame.add(usernameLabel, constraints);

        constraints.gridx = 1;
        JTextField usernameField = new JTextField(10);
        usernameField.setFont(font);
        frame.add(usernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(font);
        frame.add(passwordLabel, constraints);

        constraints.gridx = 1;
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setFont(font);
        frame.add(passwordField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        JButton loginButton = new JButton("Login");
        loginButton.setFont(font);
        frame.add(loginButton, constraints);
        loginButton.addActionListener((ActionEvent e) -> {
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();
            // process login here
            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(password));
            
            // todo: the login logic happen here
            //example
            if (username.equals("admin") && new String(password).equals("admin")) {
                // open new page
                frame.setVisible(false);
                new menu();
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect username or password");
            }
        });
        // create register button
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        JButton registerButton = new JButton("Register");
        registerButton.setFont(font);
        frame.add(registerButton, constraints);

        // add action listener to register button
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // display registration screen
                frame.getContentPane().removeAll();
                frame.add(new RegisterPanel(frame, width));
                frame.revalidate();
                frame.repaint();
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}