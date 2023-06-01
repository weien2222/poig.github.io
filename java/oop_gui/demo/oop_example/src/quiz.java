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
    public quiz(int width, int height) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        JFrame quiz = new JFrame();
        quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quiz.setSize(width, height);
        menu.setTitle("quiz"); // set title here
        
        
        quiz.setLayout(new GridBagLayout());
        // font-size
        Font quiz = new Font("Arial", Font.PLAIN, width/40);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridx = 0;
        constraints.gridy = 0;
    }
}
