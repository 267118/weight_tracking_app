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
       Color green = new Color(46,139,87);
       JButton choose = new JButton("Choose Your Split");
       choose.setBackground(green);
       choose.setBounds(200,200,400,200);
       choose.setFont(new Font("Arial", Font.BOLD, 32));
       f.add(choose);
       JLabel split = new JLabel("YOUR SPLIT");
       split.setBounds(30,30,400,100);
       split.setPreferredSize(new Dimension(400,300));
       split.setFont(new Font("Arial", Font.BOLD, 40));
       f.add(split);

       f.setVisible(true); 
 
       choose.addActionListener(e ->{
         JFrame ff = new JFrame();
         ff.setSize(800, 600);
         ff.setLayout(null);
         f.setVisible(false);
         ff.setVisible(true);
         ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel title = new JLabel("Enter Your Exercises");
         title.setBounds(30,0,400,100);
         title.setPreferredSize(new Dimension(400,300));
         title.setFont(new Font("Arial", Font.BOLD, 40));
         ff.add(title);

          int labelX = 30;
          int fieldX = 250;
          int y = 80;
          int gap = 70;

         JTextField[] inputFields = new JTextField[8]; // hold references to input fields
          for (int i = 1; i <= 7; i++) {
              JLabel dayLabel = new JLabel("Day " + i);
              dayLabel.setBounds(labelX, y, 400, 60);
              dayLabel.setFont(new Font("Arial", Font.BOLD, 40));
              ff.add(dayLabel);

              javax.swing.JTextField inputField = new javax.swing.JTextField();
              inputField.setBounds(fieldX, y + 10, 250, 40);
              inputField.setFont(new Font("Arial", Font.PLAIN, 24));
              ff.add(inputField);

              inputFields[i] = inputField; // Store reference to the input field
  
             y += gap;
          }

         JButton save = new JButton("Save and Continue");
         save.setBackground(green);
         save.setBounds(550,5,200,50);
         save.setFont(new Font("Arial", Font.BOLD, 18));
         ff.add(save);

         save.addActionListener(ev ->{
            ff.setVisible(false);
            f.setVisible(true);
         });

         choose.setText("Change Split");
         choose.setBounds(500,450, 200,50);
         choose.setFont(new Font("Arial", Font.BOLD, 17));
         f.add(choose);

           JLabel[]exerciseLabels = new JLabel[7];
           int yy = 150;
           for (int i = 0; i < 7; i++) {
           exerciseLabels[i] = new JLabel("Day " + (i + 1) + ": ");
           exerciseLabels[i].setBounds(30, yy, 400, 60);
           exerciseLabels[i].setFont(new Font("Arial", Font.PLAIN, 24));
           f.add(exerciseLabels[i]);
           yy += 50;
       }


         }); 
    }
}

