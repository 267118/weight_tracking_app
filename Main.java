import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main {
   public static void main(String[] args) {
       JFrame f = new JFrame();
       f.setSize(800, 600);
       f.setLayout(null);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       JButton choose = new JButton("Choose Your Split");
       choose.setBackground(new Color(46,139,87));
       choose.setBounds(200,200,400,200);
       choose.setFont(new Font("Arial", Font.BOLD, 32));
       f.add(choose);
       JLabel split = new JLabel("YOUR SPLIT");
       split.setBounds(30,30,400,100);
       split.setPreferredSize(new Dimension(400,300));
       split.setFont(new Font("Arial", Font.BOLD, 40));
       f.add(split);
       f.setVisible(true); 
 
       choose.addActionListener(e ->{;
         JFrame ff = new JFrame();
         ff.setSize(800, 600);
         ff.setLayout(null);
         f.setVisible(false);
         ff.setVisible(true);

          int labelX = 30;
          int fieldX = 450;
          int y = 10;
          int gap = 70;
          for (int i = 1; i <= 7; i++) {
              JLabel dayLabel = new JLabel("Day " + i);
              dayLabel.setBounds(labelX, y, 400, 60);
              dayLabel.setFont(new Font("Arial", Font.BOLD, 40));
              ff.add(dayLabel);

              javax.swing.JTextField inputField = new javax.swing.JTextField();
              inputField.setBounds(fieldX, y + 10, 250, 40);
              inputField.setFont(new Font("Arial", Font.PLAIN, 24));
              ff.add(inputField);
  
             y += gap;

        //  JLabel day1 = new JLabel("Day 1");
        //  day1.setBounds(30,10,400,100);
        //  day1.setPreferredSize(new Dimension(400,300));
        //  day1.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day1);
        //  JTextField inputField = new JTextField();
        //  inputField.setBounds(150, 50, 200, 30);
        //  ff.add(inputField);

        //  JLabel day2 = new JLabel("Day 2");
        //  day2.setBounds(30,80,400,100);
        //  day2.setPreferredSize(new Dimension(400,300));
        //  day2.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day2);
        //  JLabel day3 = new JLabel("Day 3");
        //  day3.setBounds(30,150,400,100);
        //  day3.setPreferredSize(new Dimension(400,300));
        //  day3.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day3);
        //  JLabel day4 = new JLabel("Day 4");
        //  day4.setBounds(30,220,400,100);
        //  day4.setPreferredSize(new Dimension(400,300));
        //  day4.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day4);
        //  JLabel day5 = new JLabel("Day 5");
        //  day5.setBounds(30,290,400,100);
        //  day5.setPreferredSize(new Dimension(400,300));
        //  day5.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day5);
        //  JLabel day6 = new JLabel("Day 6");
        //  day6.setBounds(30,360,400,100);
        //  day6.setPreferredSize(new Dimension(400,300));
        //  day6.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day6);   
        //  JLabel day7 = new JLabel("Day 7");
        //  day7.setBounds(30,430,400,100);
        //  day7.setPreferredSize(new Dimension(400,300));
        //  day7.setFont(new Font("Arial", Font.BOLD, 40));
        //  ff.add(day7);




        }

        

   });


}
}

