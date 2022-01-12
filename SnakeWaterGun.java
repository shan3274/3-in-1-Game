import java.awt.Font;
import java.awt.Color;
import java.util.Random;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

public class SnakeWaterGun extends JFrame{
    Random ran = new Random();
    int a = ran.nextInt(99);
    String str,str1;
    JTextField t1,t2;
    JLabel l1,l2,result;
    JButton b1,replay,home;
    SnakeWaterGun(){
        l1 = new JLabel("PLAYER");
        l1.setBounds(250,100,200,50);
        l1.setFont(new Font("sarif",Font.BOLD,20));



        t1 = new JTextField();
        t1.setBounds(200,150,200,50);
        t1.setFont(new Font("sarif",Font.BOLD,20));
        //t1.setBorder(new MatteBorder(0,0,1,0,Color.BLACK));


        result = new JLabel("Result");
        result.setBounds(400,300,200,50);
        result.setForeground(Color.blue);



        home = new JButton("HOME");
        home.setBounds(10, 10, 100, 50);
        home.setFont(new Font("sarif",Font.BOLD,10));
        home.setBackground(Color.white);
        home.setOpaque(false);
        home.addActionListener(new Home());




        l2 = new JLabel("OPPONENT");
        l2.setBounds(500,100,200,50);
        l2.setFont(new Font("sarif",Font.BOLD,20));




        replay = new JButton("Replay");
        replay.setBounds(340,400,200,50);
        replay.setBackground(Color.black);
        replay.setOpaque(false);
        replay.addActionListener(new Rpl());





        t2 = new JTextField();
        t2.setBounds(460,150,200,50);
        t2.setFont(new Font("sarif",Font.BOLD,20));
        //t2.setBorder(new MatteBorder(0,0,1,0,Color.BLACK));

        b1 = new JButton("START");
        b1.setBounds(340,250,200,50);
        b1.setBackground(Color.black);
        b1.setOpaque(false);
        b1.addActionListener(new Swg());




        add(t1);
        add(replay);
        add(result);
        add(b1);
        add(l1);
        add(t2);
        add(home);
        add(l2);
        setLayout(null);
        setBounds(200, 100, 900, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    class Rpl implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
            new SnakeWaterGun();
        }
    }

    class Swg implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (a<=33) {
                str="snake";
                t2.setText(str);
            }else if(a>33 && a<=66){
                str="water";
                t2.setText(str);
            }else{
                str="gun";
                t2.setText(str);
            }
            check();
            
        }
    }
    class Home implements ActionListener{
        public void actionPerformed(ActionEvent e){
            dispose();
            new Game();
        }
    }
    void check(){
        str1 = t1.getText();
        if (str.equals(str1)) {
            result.setText("draw");
        }else if(str1.equals("gun") && str.equals("snake") || str1.equals("water") && str.equals("gun") || 
        str1.equals("water") && str.equals("gun")) {
            result.setText("Player win");
        }else{
            result.setText("Opponent win");
        }
    }
    public static void main(String[] args) {
        new SnakeWaterGun();
    }
}
