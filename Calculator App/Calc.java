import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Calc implements ActionListener{

	
	static JFrame frame;
	static JPanel panel;
	static JButton b1;
	static JButton b2;
	static JButton b3;
	static JButton b4;
	static JButton b5;
	static JButton b6;
	static JButton b7;
	static JButton b8;
	static JButton b9;
	static JButton b0;
	static JButton bplus;
	static JButton bminus;
	static JButton bmul;
	static JButton bdiv;
	static JButton bequal;
	static JButton clear;
	static JTextArea screen;
	
	Calt obj = new Calt();
	
	public static void main(String[] args) {
		
		frame = new JFrame("Calculator");
		frame.setMinimumSize(new Dimension(350, 500));
		//frame.setBounds(10, 10, 350, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		frame.add(panel);
		
		
// Buttons		
		
		b1=new JButton("1");
		b1.setBounds(25, 100, 50, 50);
		b1.addActionListener(new Calc());
		b1.setFont(b1.getFont().deriveFont(25f));
		panel.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(100, 100, 50, 50);
		b2.addActionListener(new Calc());
		b2.setFont(b2.getFont().deriveFont(25f));
		panel.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(175, 100, 50, 50);
		b3.addActionListener(new Calc());
		b3.setFont(b3.getFont().deriveFont(25f));
		panel.add(b3);
		
		b4=new JButton("4");
		b4.setBounds(25, 175, 50, 50);
		b4.addActionListener(new Calc());
		b4.setFont(b4.getFont().deriveFont(25f));
		panel.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(100, 175, 50, 50);
		b5.addActionListener(new Calc());
		b5.setFont(b5.getFont().deriveFont(25f));
		panel.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(175, 175, 50, 50);
		b6.addActionListener(new Calc());
		b6.setFont(b6.getFont().deriveFont(25f));
		panel.add(b6);
		
		b7=new JButton("7");
		b7.setBounds(25, 250, 50, 50);
		b7.addActionListener(new Calc());
		b7.setFont(b7.getFont().deriveFont(25f));
		panel.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(100, 250, 50, 50);
		b8.addActionListener(new Calc());
		b8.setFont(b8.getFont().deriveFont(25f));
		panel.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(175, 250, 50, 50);
		b9.addActionListener(new Calc());
		b9.setFont(b9.getFont().deriveFont(25f));
		panel.add(b9);
		
		b0=new JButton("0");
		b0.setBounds(25, 325, 50, 50);
		b0.addActionListener(new Calc());
		b0.setFont(b0.getFont().deriveFont(25f));
		panel.add(b0);
		
		bdiv=new JButton("/");
		bdiv.setBounds(270, 100, 50, 50);
		bdiv.addActionListener(new Calc());
		bdiv.setFont(bdiv.getFont().deriveFont(25f));
		panel.add(bdiv);
		
		bmul=new JButton("x");
		bmul.setBounds(270, 160, 50, 50);
		bmul.addActionListener(new Calc());
		bmul.setFont(bmul.getFont().deriveFont(25f));
		panel.add(bmul);
		
		bminus=new JButton("-");
		bminus.setBounds(270, 220, 50, 50);
		bminus.addActionListener(new Calc());
		bminus.setFont(bminus.getFont().deriveFont(35f));
		panel.add(bminus);
		
		bplus=new JButton("+");
		bplus.setBounds(270, 280, 50, 100);
		bplus.addActionListener(new Calc());
		bplus.setFont(bplus.getFont().deriveFont(25f));
		panel.add(bplus);
		
		bequal=new JButton("=");
		bequal.setBounds(100, 325, 125, 50);
		bequal.addActionListener(new Calc());
		bequal.setFont(bequal.getFont().deriveFont(30f));
		panel.add(bequal);

		clear = new JButton("Clear");
		clear.setBounds(250, 25, 70, 50);
		clear.addActionListener(new Calc());
		clear.setFont(clear.getFont().deriveFont(13f));
		panel.add(clear);
		
		
		// display screen
		screen = new JTextArea("");
		screen.setBounds(25, 25, 200, 50);
		screen.setEditable(false);
		screen.setFont(screen.getFont().deriveFont(30f));
		panel.add(screen);
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		// Number buttons
		if(e.getSource()==b1) {
			screen.setText(screen.getText()+"1");
		}
		else if(e.getSource()==b2) {
			screen.setText(screen.getText()+"2");
		}
		else if(e.getSource()==b3) {
			screen.setText(screen.getText()+"3");
		}
		else if(e.getSource()==b4) {
			screen.setText(screen.getText()+"4");
		}
		else if(e.getSource()==b5) {
			screen.setText(screen.getText()+"5");
		}
		else if(e.getSource()==b6) {
			screen.setText(screen.getText()+"6");
		}
		else if(e.getSource()==b7) {
			screen.setText(screen.getText()+"7");
		}
		else if(e.getSource()==b8) {
			screen.setText(screen.getText()+"8");
		}
		else if(e.getSource()==b9) {
			screen.setText(screen.getText()+"9");
		}
		else if(e.getSource()==b0) {
			screen.setText(screen.getText()+"0");
		}
		
		
		
		
		// function buttons 
		else if(e.getSource()==bplus) {
			screen.setText(screen.getText()+" + ");
		}
		else if(e.getSource()==bminus) {
			screen.setText(screen.getText()+" - ");
		}
		else if(e.getSource()==bmul) {
			screen.setText(screen.getText()+" x ");
		}
		else if(e.getSource()==bdiv) {
			screen.setText(screen.getText()+" / ");
		}
		else if(e.getSource()==bequal) {
			String res=obj.calculate(screen.getText());
			screen.setText(screen.getText()+"=");
			screen.setText(screen.getText()+""+res);
		}
		else if(e.getSource()==clear) {
			screen.setText("");
		}
		
	}

}
class Calt{
		
	public String calculate(String exp) {
		String res="";
		int get_result=0;
		
		
		if(exp.contains("-")) {
			
			String[] ars=exp.split(" - ");
		//	System.out.println(ars[1]);
			get_result=(Integer.parseInt(ars[0]))-(Integer.parseInt(ars[1]));
			res = Integer.toString(get_result);
		}
		else if(exp.contains("+")) {
			
			String[] ars=exp.split(" +");
		//	System.out.println(ars[1]);
			get_result=(Integer.parseInt(ars[0]))+(Integer.parseInt(ars[2]));
			res = Integer.toString(get_result);
		}
		else if(exp.contains("x")) {
			
			String[] ars=exp.split(" x ");
		//	System.out.println(ars[1]);
			get_result=(Integer.parseInt(ars[0]))*(Integer.parseInt(ars[1]));
			res = Integer.toString(get_result);
		}
		else if(exp.contains("/")) {
			
			String[] ars=exp.split(" / ");
			//System.out.println(ars[1]);
			get_result=(Integer.parseInt(ars[0]))/(Integer.parseInt(ars[1]));
			res = Integer.toString(get_result);
		}
		
		return res;
		
	}
	
}
