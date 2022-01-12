import javax.swing.*;
import java.awt.event.*;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;


public class Game extends JFrame{
    JButton j1,j2,j3,j4,j5;
    JPanel panel1,panel2;
    JLabel label1,label2;
    Game(){
       label1 = new JLabel("GAMES");
       label1.setBounds(350,0,200,100);
       label1.setFont(new Font("sarif",Font.BOLD,50));
        
        


        panel1 = new JPanel();
        panel1.setBounds(0, 0, 900, 500);
        panel1.setBackground(Color.white);



        j1 = new JButton("Tic Tac Toe");
        j1.setBounds(90, 120, 200, 200);
        j1.setBackground(new Color(34, 11, 181));
        j1.setForeground(Color.white);
        j1.setFont(new Font("sarif",Font.BOLD,15));
        j1.addActionListener(new Ticteoteo());
        //j1.setOpaque(false);
        

        j2 = new JButton("Guess the Number");
        j2.setBounds(340, 120, 200, 200);
        j2.setBackground(new Color(34, 11, 181));
        j2.setForeground(Color.white);
        j2.setFont(new Font("sarif",Font.BOLD,15));
        j2.addActionListener(new Guessthe());
        //j2.setOpaque(false);



        j3 = new JButton("Snake water gun");
        j3.setBounds(590, 120, 200, 200);
        j3.setBackground(new Color(34, 11, 181));
        j3.setForeground(Color.white);
        j3.setFont(new Font("sarif",Font.BOLD,15));
        j3.addActionListener(new Swg());
        //j3.setOpaque(false);



        add(j1);
        add(j2);
        add(j3);
        add(label1);
        add(panel1);
        setLayout(null);
        setBounds(200, 100, 900, 500);
        setVisible(true);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   class Guessthe implements ActionListener{
      public void actionPerformed(ActionEvent e){
            new GuessTheNumber();
            dispose();
       }
   }
   class  Ticteoteo implements ActionListener{
       public void actionPerformed(ActionEvent e){
           new ticteoteo();
           dispose();
       }
   }
   class Swg implements ActionListener{
       public void actionPerformed(ActionEvent e){
           new SnakeWaterGun();
           dispose();
       }
   }
    public static void main(String[] args) {
        new Game();
    }
}
