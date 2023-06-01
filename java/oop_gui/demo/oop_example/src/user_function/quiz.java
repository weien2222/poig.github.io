package user_function;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poig
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class quiz  extends JPanel {
    private final JFrame quiz;
    
    public quiz(int width, int height) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        quiz = new JFrame();
        quiz.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // for user-log
        System.out.println("Enter quiz");
        width = (int) (width * 0.5);
        height = (int) (height * 0.5);
        quiz.setSize(width, height);
        quiz.setTitle("quiz"); // set title here
        
        
        quiz.setLayout(new GridBagLayout());
        // font-size
        Font font = new Font("Arial", Font.PLAIN, width/40);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;
        
        quiz.setVisible(true);
        quiz.setLocationRelativeTo(null); // Center the frame on the screen
    }
    
    public void addQuizWindowListener(WindowListener listener) {
        this.quiz.addWindowListener(listener);
    }
    
}
