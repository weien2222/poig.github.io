
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class example extends JFrame implements ActionListener {

    // Declare variables
    JLabel question;
    JRadioButton option1;
    JRadioButton option2;
    JRadioButton option3;
    JRadioButton option4;
    ButtonGroup optionsGroup;
    JButton nextButton;
    JButton hintButton;
    int currentQuestion = 0;

    // Array of questions
    String[][] questions = {
        {"Do you know what sustainable fashion is?",
            "It is fashion that is ethically made and environmentally friendly.",
            "It is a kind of fashion that will become outdated in a short time.",
            "It is a kind of fashion that is very lucrative.",
            "All above"},
        {"Question 2", "Option 1", "Option 2", "Option 3", "Option 4"},
        {"Question 3", "Option 1", "Option 2", "Option 3", "Option 4"}
    };
    
    String[] answers = {
        "1",
        "2",
        "3",
        
    };

    public example() {
        // Set layout
        setLayout(new GridLayout(6, 1));

        // Initialize components
        question = new JLabel(questions[currentQuestion][0]);
        option1 = new JRadioButton(questions[currentQuestion][1]);
        option2 = new JRadioButton(questions[currentQuestion][2]);
        option3 = new JRadioButton(questions[currentQuestion][3]);
        option4 = new JRadioButton(questions[currentQuestion][4]);
        optionsGroup = new ButtonGroup();
        nextButton = new JButton("Submit");

        // Add components to frame
        add(question);
        add(option1);
        add(option2);
        add(option3);
        add(option4);
        add(nextButton);
        
        option1.setActionCommand("1");
        option2.setActionCommand("2");
        option3.setActionCommand("3");
        option4.setActionCommand("4");   

        // Add radio buttons to button group
        optionsGroup.add(option1);
        optionsGroup.add(option2);
        optionsGroup.add(option3);
        optionsGroup.add(option4);

        // Add action listener to next button
        nextButton.addActionListener(this);

        // Set frame properties
        setTitle("Quiz Example");
        setSize(400, 400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            
            if (optionsGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "where is your answer!");
            } else if (optionsGroup.getSelection().getActionCommand().equals(answers[currentQuestion])){
                JOptionPane.showMessageDialog(this, "correct!");
            }else{
                JOptionPane.showMessageDialog(this, "you fucked up, Next!!");
            }

            currentQuestion++;
            if (currentQuestion < questions.length) {
                question.setText(questions[currentQuestion][0]);
                option1.setText(questions[currentQuestion][1]);
                option2.setText(questions[currentQuestion][2]);
                option3.setText(questions[currentQuestion][3]);
                option4.setText(questions[currentQuestion][4]);
            } else {
                JOptionPane.showMessageDialog(this, "End of quiz!");
                dispose();
            }
            optionsGroup.clearSelection();
        } else if (e.getSource() == hintButton) {

        }
    }

    public static void main(String[] args) {
        new example();
    }
}
