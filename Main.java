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

        }

        

   });


}
}

