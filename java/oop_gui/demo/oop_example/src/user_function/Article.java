package user_function;
import main.menu;
import main.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Article {
    // add to main: public static String inp1, inp2, inp3;
    // add to main: public static int count=1;
    
    JFrame f;
    
    public Article(int width, int height){
        String a1Content = "Sustainable Fashion";
        String a2Content = "Sustainable Living";
        String a3Content = "Global Warming";
        if(main.count==1){
            main.inp1 = a1Content;
            main.inp2 = a2Content;
            main.inp3 = a3Content;
            main.count++;
        }
        
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(width, height);
        f.setLocationRelativeTo(null);
        
        f.setTitle("Articles"); 
        Font font = new Font("Arial", Font.PLAIN, width/40);
        
        JTabbedPane tp = new JTabbedPane();
        JPanel ap = new JPanel(new BorderLayout()); 
        ap.setBounds(10,10,15,50);
        
        int w = 13;
        int h = 45;
        JTextArea list1 = new JTextArea(w,h);
        list1.setFont(font);
        list1.setText(main.inp1);
        list1.setEditable(true);
        JScrollPane sp1 = new JScrollPane(list1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JTextArea list2 = new JTextArea(w,h);
        list2.setFont(font);
        list2.setText(main.inp2);
        list2.setEditable(true);
        JScrollPane sp2 = new JScrollPane(list2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JTextArea list3 = new JTextArea(w,h);
        list3.setFont(font);
        list3.setText(main.inp3);
        list3.setEditable(true);
        JScrollPane sp3 = new JScrollPane(list3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        tp.add("article 1", sp1);
        tp.add("article 2", sp2);
        tp.add("article 3", sp3);
        ap.add(tp,BorderLayout.NORTH);
        
        JButton back = new JButton("Back to Main Menu");
        back.setFont(font);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!list1.getText().equals(main.inp1)||!list2.getText().equals(main.inp2)||!list3.getText().equals(main.inp3)){
                    main.inp1 = list1.getText();
                    main.inp2 = list2.getText();
                    main.inp3 = list3.getText();
                } else{
                    main.inp1 = main.inp1;
                    main.inp2 = main.inp2;
                    main.inp3 = main.inp3;
                }
                System.out.println(list1.getText());
                System.out.println(main.inp1);
                f.setVisible(false);

            }
        });
        
        ap.setFont(font);
        ap.add(back,BorderLayout.WEST);
        f.add(ap);
        f.setVisible(true);
    }
    public void addWindowListener(WindowListener listener) {
        this.f.addWindowListener(listener);
    }
    
    public static void main(String[] args) {
        new Article(1600, 600);
    }
}
