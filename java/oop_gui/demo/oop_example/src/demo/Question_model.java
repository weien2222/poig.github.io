package demo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author wanqinng
 */
import javax.swing.JOptionPane;

public class Question_model {

    public static void main(String[] args) {
        /*String[] acceptableValues = {"Choice 1", "Choice 2", "Choice 3"};
        String Input1 = (String)JOptionPane.showInputDialog(null,
                        "Is this a question?",
                        "Dialog Title",
                        2,
                        null,
                        acceptableValues,
                        acceptableValues[2]);*/
        
        //Q1
        String[] answers1 = {"Select your answer",
                            "It is fashion that is ethically made and environmentally friendly.", 
                            "It is a kind of fashion that will become outdated in a short time.",
                            "It is a kind of fashion that is very lucrative."};
        String Input1 = (String)JOptionPane.showInputDialog(null,
                        "Do you know what sustainable fashion is?",
                        "Question 1",
                        2,
                        null,
                        answers1,
                        answers1[0]);
        
        if(Input1 == answers1[1]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 1", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers1[1],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "Sustainable fashion is a way in which brands create clothing that not only reduces the impact on the environment but is also mindful of the people who work to produce the garments.",
                                    "Explanation", 
                                    0);    
        }
        
        //Q2
        String[] answers2 = {"Select your answer",
                            "Less than 1%",
                            "4%",
                            "10%",
                            "15%"};
        String Input2 = (String)JOptionPane.showInputDialog(null,
                        "What percentage of total global greenhouse gas emissions are produced by the fashion industry?",
                        "Question 2",
                        2,
                        null,
                        answers2,
                        answers2[0]);
        
        if(Input2 == answers2[2]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 2", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers2[2],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "The fashion industry is responsible for at least 4% of global greenhouse gas emissions - more than the carbon output of the economies of France, Germany and the United Kingdom combined.",
                                    "Explanation", 
                                    0);
        
        //Q3
        String[] answers3 = {"Select your answer",
                            "SDG 12: Responsible Consumption and Production",
                            "SDG 7: Affordable and Clean Energy",
                            "SDG 9: Industry, Innovation and Infrastructure"};
        String Input3 = (String)JOptionPane.showInputDialog(null,
                        "Do you know what Sustainable Development Goals (SDGs) is related to sustainable fashion?",
                        "Question 3",
                        2,
                        null,
                        answers3,
                        answers3[0]);
        
        if(Input3 == answers3[1]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 3", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers3[1],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "One of the most important SDGs for the fashion industry is SDG 12, which calls for the decoupling of economic growth from increasing resource consumption. ",
                                    "Explanation", 
                                    0);
        //Q4    
        String[] answers4 = {"Select your answer",
                            "Deforestation",
                            "Desertification and degradation of soil",
                            "Loss of Biodiversity",
                            "All of the above"};
        String Input4 = (String)JOptionPane.showInputDialog(null,
                        "The fashion industry contributes to environmental degradation in which of the following ways?",
                        "Question 4",
                        2,
                        null,
                        answers4,
                        answers4[0]);
        
        if(Input4 == answers4[4]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 4", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers4[4],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                "The fashion industry contributes to all of the above. Deforestation occurs when land is cleared for grazing animals that produce leather, wool, and other animal products. Deforestation and overgrazing can cause desertification and soil degradation. With this habitat loss and pollution from production, the fashion industry causes a loss of biodiversity as well.",
                                "Explanation", 
                                    0);
         
        //Q5
        String[] answers5 = {"Select your answer",
                            "52 liters",
                            "476 liters",
                            "1028 liters",
                            "3781 liters"};
        String Input5 = (String)JOptionPane.showInputDialog(null,
                        "How many litres of water does it take to make a pair of jeans?",
                        "Question 5",
                        2,
                        null,
                        answers5,
                        answers5[0]);
        
        if(Input5 == answers5[4]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 5", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers5[4],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "It takes 3,781 liters of water to make one pair of jeans, from the production of the cotton to the delivery of the finished garment to a store. Textile manufacturing uses 20% of the world’s clean water each year.",
                                    "Explanation", 
                                    0); 
        
        //Q6    
        String[] answers6 = {"Select your answer", "Uniqlo", "H&M", "Zara", "Adidas"};
        String Input6 = (String)JOptionPane.showInputDialog(null,
                        "Do you know which is the following brand implementing sustainable fashion concepts?",
                        "Question 6",
                        2,
                        null,
                        answers6,
                        answers6[0]);
        
        if(Input6 == answers6[4]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 1", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers1[1],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "Sustainable fashion is a way in which brands create clothing that not only reduces the impact on the environment but is also mindful of the people who work to produce the garments.",
                                    "Explanation", 
                                    0); 
        
        //Q7   
        String[] answers7 = {"Select your answer",
                            "Reduced waste generation",
                            "Fair wages and healthy work environment",
                            "Reduced carbon dioxide and greenhouse gases emissions",
                            "Make people feel more comfortable about the clothes they are wearing"};
        String Input7 = (String)JOptionPane.showInputDialog(null,
                        "Do you know why sustainable fashion is important? Select the wrong answer of the importance of sustainable fashion.",
                        "Question 7",
                        2,
                        null,
                        answers7,
                        answers7[0]);
        
        if(Input7 == answers7[4]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 7", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers7[4],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "Sustainable fashion aims to having an impact on protect our mother earth from global warming and also protect human rights.",
                                    "Explanation", 
                                    0); 
        
        //Q8
        String[] answers8 = {"Select your answer",
                            "Donate them to charities and shelters",
                            "Repurpose them as rags",
                            "Repair or alter them into something wearable, like cutting jeans into shorts",
                            "All of the above"};
        String Input8 = (String)JOptionPane.showInputDialog(null,
                        "Instead of throwing out unwanted clothing and contributing to textile waste, what can you do instead?",
                        "Question 8",
                        2,
                        null,
                        answers8,
                        answers8[0]);
        
        if(Input8 == answers8[4]){
            JOptionPane.showMessageDialog(null,
                                    "You are correct, move on to next question!",
                                    "Question 8", 
                                    0);
           
        }else{
            JOptionPane.showMessageDialog(null,
                                    "The correct answer is " + answers8[4],
                                    "Correct Answer", 
                                    0);
            JOptionPane.showMessageDialog(null,
                                    "All of the above are good alternatives to throwing out unwanted clothing. Just because a piece is no longer your size or style doesn’t mean it won’t be someone else’s, and there are so many ways to upcycle your old clothes into something new!",
                                    "Explanation", 
                                    0);    
        }
        
        //Q9
        String[] response1 = {"Yes", "No"};
        String Input9 = (String)JOptionPane.showInputDialog(null,
                        "Do you practice any habits to support sustainable fashion?",
                        "Question 9",
                        2,
                        null,
                        response1,
                        response1[0]);
        
        if(Input9 == response1[0]){
            String input = (String)JOptionPane.showInputDialog(null,
                    "What habit is doing now?",
                    "Question 9",
                    2,
                    null,
                    null,
                    "Your answer");
            JOptionPane.showMessageDialog(null,
                                    "Cool! You can also try following ways to support sustainable fashion: buy less and buy better, shop secondhand and vintage and support brands who have a positive impact",
                                    "Explanation", 
                                    0);  
        }else{
            JOptionPane.showMessageDialog(null,
                                    "You can try following ways to support sustainable fashion: buy less and buy better, shop secondhand and vintage and support brands who have a positive impact",
                                    "Explanation", 
                                    0);  
        }
        
        //Q10
        String input10 = (String)JOptionPane.showInputDialog(null,
                    "Share your experiences after doing our quiz! (eg. Share what you have learned, what are you going to do after having the knowledge)",
                    "Question 10",
                    2,
                    null,
                    null,
                    "Your response");
        JOptionPane.showMessageDialog(null,
                                    "We feel so excited that we can be a part of saving our earth by supporting sustainable fashion! ",
                                    "Thank you!", 
                                    0); 
        }
    }
}
        
        
