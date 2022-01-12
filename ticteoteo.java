import java.awt.Color;
import java.awt.*;
import javax.swing.border.MatteBorder;
import javax.swing.*;
import java.awt.event.*;


public class ticteoteo extends JFrame{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
	JLabel j1;
	String arr[] = {"X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O","X","O"};
	int count=0;
	String str,str2,str3,str4,str5,str6,str7,str8,str9,c1,c2,c3,c4,c5,c6,c7,c8,c9;

    ticteoteo(){
	b1 = new JButton(" ");
	b2 = new JButton(" ");
	b3 = new JButton(" ");
	b4 = new JButton(" ");
	b5 = new JButton(" ");
	b6 = new JButton(" ");
	b7 = new JButton(" ");
	b8 = new JButton(" ");
	b9 = new JButton(" ");
	

	reset = new JButton("Rest");
	reset.setBounds(10,415,130,35);
	reset.setFont(new Font("Serif",Font.BOLD,10));

	j1 = new JLabel("hello");
	j1.setBounds(300,410,100,50);	
	

	b1.setBounds(0,0,133,133);
	b2.setBounds(133,0,133,133);
	b3.setBounds(266,0,133,133);
	b4.setBounds(0,133,133,133);
	b5.setBounds(133,133,133,133);
	b6.setBounds(266,133,133,133);
	b7.setBounds(0,266,133,133);
	b8.setBounds(133,266,133,133);
	b9.setBounds(266,266,133,133);



	b1.setFont(new Font("Serif",Font.BOLD,30));
	b2.setFont(new Font("Serif",Font.BOLD,30));
	b3.setFont(new Font("Serif",Font.BOLD,30));
	b4.setFont(new Font("Serif",Font.BOLD,30));
	b5.setFont(new Font("Serif",Font.BOLD,30));
	b6.setFont(new Font("Serif",Font.BOLD,30));
	b7.setFont(new Font("Serif",Font.BOLD,30));
	b8.setFont(new Font("Serif",Font.BOLD,30));
	b9.setFont(new Font("Serif",Font.BOLD,30));


	b1.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b1.setBackground(Color.white);
	b1.setOpaque(false);
	
	


	b2.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b2.setBackground(Color.white);
	b2.setOpaque(false);
	b2.addActionListener(new btn2());


	b3.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b3.setBackground(Color.white);
	b3.setOpaque(false);


	b4.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b4.setBackground(Color.white);
	b4.setOpaque(false);


	b5.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b5.setBackground(Color.white);
	b5.setOpaque(false);


	b6.setBorder(new MatteBorder(1,1,1,1,Color.black));
	b6.setBackground(Color.white);
	b6.setOpaque(false);


	b7.setBorder(new MatteBorder(1,1,2,1,Color.black));
	b7.setBackground(Color.white);
	b7.setOpaque(false);


	b8.setBorder(new MatteBorder(1,1,2,1,Color.black));
	b8.setBackground(Color.white);
	b8.setOpaque(false);


	b9.setBorder(new MatteBorder(1,1,2,1,Color.black));
	b9.setBackground(Color.white);
	b8.setOpaque(false);



	// home = new JButton("HOME");
	// home.setBounds(10, 10, 100, 50);
	// home.setFont(new Font("sarif",Font.BOLD,10));
	// home.setBackground(Color.white);
	// home.setOpaque(false);
	// home.addActionListener(new Home());




	b1.addActionListener(new btn1());
	b2.addActionListener(new btn2());
	b3.addActionListener(new btn3());
	b4.addActionListener(new btn4());
	b5.addActionListener(new btn5());
	b6.addActionListener(new btn6());
	b7.addActionListener(new btn7());
	b8.addActionListener(new btn8());
	b9.addActionListener(new btn9());
	reset.addActionListener(new resetb());

	


	add(b1);
	
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);
	add(j1);
	add(reset);

	


	setLayout(null);
	setBounds(400,150,416,500);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


	class btn1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
	
	
	str = b1.getText();
	if(str.equals("X") || str.equals("O")){
		count=count;
		
		
	}else{
			b1.setText(arr[count]);
			count=count+1;
	}	
	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	System.out.println(count);
            
        }
    }

	class btn2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
	
	
	str2 = b2.getText();
	if(str2.equals("X") || str2.equals("O")){
		count=count;
		
	}else{
			b2.setText(arr[count]);
			count=count+1;
	}
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
		System.out.println(count);
            
        }
    }


	class btn3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str3 = b3.getText();
	if(str3.equals("X") || str3.equals("O")){
		count=count;
		
		
	}else{
			b3.setText(arr[count]);
			count=count+1;
	}	

	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	
	
	System.out.println(count);
        }
    }

	class btn4 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str4 = b4.getText();
	if(str4.equals("X") || str4.equals("O")){
		count=count;
		
		
	}else{
			b4.setText(arr[count]);
			count=count+1;
	}	

	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	
	
	System.out.println(count);
            
        }
    }

	class btn5 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str5 = b5.getText();
	if(str5.equals("X") || str5.equals("O")){
		count=count;
		
		
	}else{
			b5.setText(arr[count]);
			count=count+1;
	}	
	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	System.out.println(count);
            
        }
    }

	class btn6 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str6 = b6.getText();
	if(str6.equals("X") || str6.equals("O")){
		count=count;
		
		
	}else{
			b6.setText(arr[count]);
			count=count+1;
	}	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	
	System.out.println(count);
        }
    }

	class btn7 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str7 = b7.getText();
	if(str7.equals("X") || str7.equals("O")){
		count=count;
		
		
	}else{
			b7.setText(arr[count]);
			count=count+1;
	}	
	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	System.out.println(count);
        }
    }

	class btn8 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str8 = b8.getText();
	if(str8.equals("X") || str8.equals("O")){
		count=count;
		
		
	}else{
			b8.setText(arr[count]);
			count=count+1;
	}	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	
	System.out.println(count);
        }
    }

	class btn9 implements ActionListener{
        public void actionPerformed(ActionEvent e){
         	str9 = b9.getText();
	if(str9.equals("X") || str9.equals("O")){
		count=count;
		
		
	}else{
			b9.setText(arr[count]);
			count=count+1;
	}	
	
	if(check() == 1){
		j1.setText("Wins");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
		new result();
		
	}else if(check() == 0){
		j1.setText("Draw");
		b2.setText(" ");
		b1.setText(" ");
		b3.setText(" ");
		b4.setText(" ");
		b5.setText(" ");
		b6.setText(" ");
		b7.setText(" ");
		b8.setText(" ");
		b9.setText(" ");
		count=0;
	}
	System.out.println(count);
        }
    }


	class resetb implements ActionListener{
        public void actionPerformed(ActionEvent e){
	b2.setText(" ");
	b1.setText(" ");
	b3.setText(" ");
	b4.setText(" ");
	b5.setText(" ");
	b6.setText(" ");
	b7.setText(" ");
	b8.setText(" ");
	b9.setText(" ");
	count=0;
	

         	
    }

}



	
    int check(){
	c1=b1.getText();
	c2=b2.getText();
	c3=b3.getText();
	c4=b4.getText();
	c5=b5.getText();
	c6=b6.getText();
	c7=b7.getText();
	c8=b8.getText();
	c9=b9.getText();
	
	if(c1.equals("X") && c2.equals("X") && c3.equals("X") || c1.equals("O") && c2.equals("O") && c3.equals("O")){
		return 1;
	}
	else if(c4.equals("X") && c5.equals("X") && c6.equals("X") || c4.equals("O") && c5.equals("O") && c6.equals("O")){
		return 1;
	}
	else if(c7.equals("X") && c8.equals("X") && c9.equals("X") || c7.equals("O") && c8.equals("O") && c9.equals("O")){
		return 1;
	}



	else if(c1.equals("X") && c5.equals("X") && c9.equals("X") || c1.equals("O") && c5.equals("O") && c9.equals("O")){
		return 1;
	}  
	else if(c3.equals("X") && c5.equals("X") && c7.equals("X") || c3.equals("O") && c5.equals("O") && c7.equals("O")){
		return 1;
	} 
	else if(c2.equals("X") && c5.equals("X") && c8.equals("X") || c2.equals("O") && c5.equals("O") && c8.equals("O")){
		return 1;
	} 

	return -1;




}

    class result extends JFrame{
	result(){
		setBounds(520,270,200,200);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		JButton button = new JButton("CLOSE");
		button.addActionListener(new closea());
		button.setBounds(50,50,60,30);

		add(button);


	}
	class closea implements ActionListener{
        public void actionPerformed(ActionEvent e){
		dispose();

	}
}
}
class Home implements ActionListener{
	public void actionPerformed(ActionEvent e){
		dispose();
		new Game();
	}
}
    public static void main(String[] args) {
        new ticteoteo();
    }
}
