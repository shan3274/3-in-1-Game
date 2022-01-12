import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuessTheNumber extends JFrame{

    JButton b1,b2,home;
    JTextField t1;
    JLabel l1,l2;

    Random ran = new Random();
    int a = ran.nextInt(100);
    int n;
    int counter=1;

    GuessTheNumber(){

        t1 = new JTextField();
        t1.setBounds(300, 100, 300, 100);
        t1.setFont(new Font("sarif",Font.BOLD,50));

        b1 = new JButton("GUESS");
        b1.setBounds(300, 220, 300, 100);
        b1.setFont(new Font("sarif",Font.BOLD,50));
        b1.setBackground(Color.white);
        b1.setOpaque(false);
        b1.addActionListener(new Guess());


        home = new JButton("HOME");
        home.setBounds(10, 10, 100, 50);
        home.setFont(new Font("sarif",Font.BOLD,10));
        home.setBackground(Color.white);
        home.setOpaque(false);
        home.addActionListener(new Home());




        b2 = new JButton("Replay");
        b2.setBounds(350, 350, 200, 50);
        b2.setFont(new Font("sarif",Font.BOLD,25));
        b2.setBackground(Color.white);
        b2.setOpaque(false);
        b2.addActionListener(new Rpl());

        l2 = new JLabel("");
        l2.setBounds(330, 0, 300, 100);
        l2.setFont(new Font("sarif",Font.BOLD,15));
        l2.setForeground(Color.blue);
        

        add(t1);
        add(b1);
        add(home);
        add(l2);
        add(b2);
        setLayout(null);
        setBounds(200, 100, 900, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class Guess implements ActionListener{
        public void actionPerformed(ActionEvent e){
          n=Integer.parseInt(t1.getText());
         // while (a!=n) {
            
            if (n>a) {
                l2.setText("Guess the lower number");
                n=Integer.parseInt(t1.getText());
                counter++;
            }
            else if (n<a) {
                l2.setText("Guess the higher number");
                n=Integer.parseInt(t1.getText());
                counter++;
            }
       // }
       else{
        l2.setText("Correct you guess the number in " + counter + " attempt");
       }
       t1.setText("");
        }
    }
    class Rpl implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
            new GuessTheNumber();
        }
    }

    class Home implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
            new Game();
        }
    }
    public static void main(String[] args) {
        new GuessTheNumber();
    }
}
