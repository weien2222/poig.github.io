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

public class quiz extends JPanel {

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
    int ques_type = 0;
    GridBagConstraints constraints;
    Font font;
    JButton quesButton;

    // Array of questions
    String[][][] questions = {
        // sustainable Fashion
        // question 1
        {{"Do you know what sustainable fashion is?",
            // option 1
            "It is fashion that is ethically made and environmentally friendly.",
            // option 2
            "It is a kind of fashion that will become outdated in a short time.",
            // option 3
            "It is a kind of fashion that is very lucrative.",
            //option 4
            "All above"},
            // question 2
            {"Question 2", "Option 1", "Option 2", "Option 3", "Option 4"},
            // question 3
            {"Question 3", "Option 1", "Option 2", "Option 3", "Option 4"}},

        // Global Warming
        // qeustion 1
        {{"Global warming is a consequence of ____",
            // option 1
            "Acid rain",
            // option 2
            "Greenhouse effect",
            // option 3
            "Depletion of the ozone layer",
            // option 4
            "Radioactive fall out"},
            {"Question 2", "Option 1", "Option 2", "Option 3", "Option 4"},},
        
// same for the last topics
        {{"Question 1", "Option 1", "Option 2", "Option 3", "Option 4"},
            {"Question 2", "Option 1", "Option 2", "Option 3", "Option 4"},}
    };

    String[][] answers = {
        // answer for the sustainable Fashion
        // answer for question 1
        {"1",
            // answer for quesiton 2
            "2",
            // answer for question 3
            "3",},
        
        //answer for the global warming
        {"1",
            "2",
            "3"},
        
        {"1",
        "2"}
    };

    String[][] hints = {
        // hints for the sustainable Fashion
        // hints for question 1
        {"1",
            // hint for question 2
            "2",
            "3",},
        // hints for the global warming
        // hints for question 1
        {"1",
            // hints for question 2
            "2",
            "3"},
        
        // same for others
        {"",
            "",
            ""}
    };

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
        quiz.setTitle("quiz select"); // set title here

        quiz.setLayout(new GridBagLayout());
        // font-size
        font = new Font("Arial", Font.PLAIN, width / 40);

        constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        constraints.gridx = 0;
        constraints.gridy = 0;
        
        // first button
        quesButton = new JButton("fashion");
        quesButton.setFont(font);
        quiz.add(quesButton, constraints);
        quesButton.addActionListener((ActionEvent e) -> {
            ques_type = 0;
            quiz.getContentPane().removeAll();
            QuizPanel();
            quiz.revalidate();
            quiz.repaint();
        });
        
        //second button
        constraints.gridx = 2;
        constraints.gridy = 0;
        quesButton = new JButton("Global Warming");
        quesButton.setFont(font);
        quiz.add(quesButton, constraints);
        quesButton.addActionListener((ActionEvent e) -> {
            ques_type = 1;
            quiz.getContentPane().removeAll();
            QuizPanel();
            quiz.revalidate();
            quiz.repaint();
        });
        
        //second button
        constraints.gridx = 3;
        constraints.gridy = 0;
        quesButton = new JButton("Sustainable Lifestyle");
        quesButton.setFont(font);
        quiz.add(quesButton, constraints);
        quesButton.addActionListener((ActionEvent e) -> {
            ques_type = 2;
            quiz.getContentPane().removeAll();
            QuizPanel();
            quiz.revalidate();
            quiz.repaint();
        });
        
        quiz.setVisible(true);
        quiz.setLocationRelativeTo(null); // Center the frame on the screen

        // move into the quiz panel
        //quiz.getContentPane().removeAll();
    }

    public void QuizPanel() {

        // Initialize components
        question = new JLabel(questions[ques_type][currentQuestion][0]);
        option1 = new JRadioButton(questions[ques_type][currentQuestion][1]);
        option2 = new JRadioButton(questions[ques_type][currentQuestion][2]);
        option3 = new JRadioButton(questions[ques_type][currentQuestion][3]);
        option4 = new JRadioButton(questions[ques_type][currentQuestion][4]);
        optionsGroup = new ButtonGroup();
        nextButton = new JButton("Submit");
        hintButton = new JButton("Hints");

        // set font
        question.setFont(font);
        option1.setFont(font);
        option2.setFont(font);
        option3.setFont(font);
        option4.setFont(font);
        nextButton.setFont(font);
        hintButton.setFont(font);

        // Add components to frame
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        quiz.add(question, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        quiz.add(option1, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        quiz.add(option2, constraints);
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        quiz.add(option3, constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        quiz.add(option4, constraints);
        constraints.gridx = 1;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        quiz.add(nextButton, constraints);
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        quiz.add(hintButton, constraints);

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
        // nextButton.addActionListener((ActionListener) this);
        nextButton.addActionListener((ActionEvent e) -> {
            // display registration screen
            if (optionsGroup.getSelection() == null) {
                JOptionPane.showMessageDialog(this, "where is your answer!");
            } else {
                if (optionsGroup.getSelection().getActionCommand().equals(answers[ques_type][currentQuestion])) {
                    JOptionPane.showMessageDialog(quiz, "correct!");
                } else {
                    JOptionPane.showMessageDialog(quiz, "you fucked up, Next!!");
                }
                currentQuestion++;
                if (currentQuestion < questions[ques_type].length) {
                    question.setText(questions[ques_type][currentQuestion][0]);
                    option1.setText(questions[ques_type][currentQuestion][1]);
                    option2.setText(questions[ques_type][currentQuestion][2]);
                    option3.setText(questions[ques_type][currentQuestion][3]);
                    option4.setText(questions[ques_type][currentQuestion][4]);
                } else {
                    JOptionPane.showMessageDialog(quiz, "End of quiz!");
                    quiz.dispose();
                }
                optionsGroup.clearSelection();
            }
        });

        hintButton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(quiz, hints[ques_type][currentQuestion]);
        });

        // Set frame properties
        setSize(400, 400);
        setVisible(true);
    }

    public void addQuizWindowListener(WindowListener listener) {
        this.quiz.addWindowListener(listener);
    }

    public static void main(String[] args) {
        new quiz(1000, 600);
    }

}
