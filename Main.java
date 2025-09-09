import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


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
   }


}

