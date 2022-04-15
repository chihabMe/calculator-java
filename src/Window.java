import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Window extends JFrame  implements ActionListener  {
	private JTextField textField;
	// the main panel 
	JPanel panel ;
	//my buttons 
	//numbers 
	JButton[] Nbuttons = new JButton[10];
	//operations 
	JButton btnNewButton_P;
	JButton btnNewButton_Po_Ni;
	JButton btnNewButton_Pl;
	JButton btnNewButton_Mn ;
	JButton btnNewButton_Ml;
	JButton btnNewButton_Di;
	JButton btnNewButton_Eq;
	JButton btnNewButton_Sq;
	JButton btnNewButton_Rt;
	JButton btnNewButton_Ln;
	JButton btnNewButton_Ex;
	JButton btnNewButton_Dl ;
	JButton btnNewButton_Ac;
	//numbers
	JButton btnNewButton_4 ;
	
	JButton btnNewButton_1;
	JButton btnNewButton_0;
	JButton btnNewButton_7 ;
	JButton btnNewButton_8 ;
	JButton btnNewButton_5 ;
	JButton btnNewButton_2 ;
	JButton btnNewButton_9 ;
	JButton btnNewButton_6 ;
	JButton btnNewButton_3 ;
	//some variables for calculation
	String operation=null;
	float firInp = 0f;
	float secInput =0f;
	//constructer
	
	Window(){
		this.getContentPane().setBackground(new Color(44, 44, 44)	);
		this.setBackground(new Color(44, 44, 44)	);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setBounds(100, 100, 300, 350);
		//creaing the text field
		createThePanel();

		createTheTextField();
		//creating the buttons 
		createButtons();
		//adding + acreating the panel 
		
		this.setVisible(true);
		
		
	}
	public void createThePanel() {
		
		this.panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(44, 44, 44)	);
		panel.setBounds(12, 63, 276, 259);
		panel.setLayout(null);
		this.getContentPane().add(panel);

	}

		void createButtons() {
			
		//start creating the buttons + adding them to the list
			JButton btnNewButton_4 = new JButton("4");
			btnNewButton_4.setBounds(0, 139, 46, 27);
			
			JButton btnNewButton_1 = new JButton("1");
			btnNewButton_1.setBounds(0, 178, 46, 27);
			
			JButton btnNewButton_0 = new JButton("0");
			btnNewButton_0.setBounds(0, 217, 46, 27);
			
			JButton btnNewButton_7 = new JButton("7");
			btnNewButton_7.setBounds(0, 100, 46, 27);
			
			JButton btnNewButton_8 = new JButton("8");
			btnNewButton_8.setBounds(58, 100, 46, 27);
			
			JButton btnNewButton_5 = new JButton("5");
			btnNewButton_5.setBounds(58, 139, 46, 27);
			
			JButton btnNewButton_2 = new JButton("2");
			btnNewButton_2.setBounds(58, 178, 46, 27);

			
			JButton btnNewButton_9 = new JButton("9");
			btnNewButton_9.setBounds(116, 100, 46, 27);
			
			JButton btnNewButton_6 = new JButton("6");
			btnNewButton_6.setBounds(116, 139, 46, 27);
			
			JButton btnNewButton_3 = new JButton("3");
			btnNewButton_3.setBounds(116, 178, 46, 27)
		
;
	//start adding the buttons to the array list 
		Nbuttons[0]=btnNewButton_0;
		Nbuttons[1]=btnNewButton_1;
		Nbuttons[2]=btnNewButton_2;
		Nbuttons[3]=btnNewButton_3;
		Nbuttons[4]=btnNewButton_4;
		Nbuttons[5]=btnNewButton_5;
		Nbuttons[6]=btnNewButton_6;
		Nbuttons[7]=btnNewButton_7;
		Nbuttons[8]=btnNewButton_8;
		Nbuttons[9]=btnNewButton_9;
		//start adding the buttons to the panel + adding some styles
		for(int i=0;i<10;i++) {
			Nbuttons[i].setMargin(new Insets(0, 0, 0, 0));
			Nbuttons[i].setBackground(new Color(66, 66, 66));
			Nbuttons[i].setForeground(UIManager.getColor("Button.background"));
			Nbuttons[i].addActionListener(this);
			
			this.panel.add(Nbuttons[i]);

		}
		//start creating the [.] / [+/-] ... 
		btnNewButton_P = new JButton(".");
		btnNewButton_P.setBounds(58, 217, 46, 27);
		btnNewButton_P.setBackground(new Color(66, 66, 66));
		btnNewButton_P.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_P.addActionListener(this);
		this.panel.add(btnNewButton_P);
	

		
		btnNewButton_Po_Ni = new JButton("+/-");
		btnNewButton_Po_Ni.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Po_Ni.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Po_Ni.setBackground(new Color(66, 66, 66));
		btnNewButton_Po_Ni.setBounds(116, 217, 46, 27);
		btnNewButton_Po_Ni.addActionListener(this);
		panel.add(btnNewButton_Po_Ni);

		btnNewButton_Pl = new JButton("+");
		btnNewButton_Pl.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Pl.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Pl.setBackground(new Color(66, 66, 66));
		btnNewButton_Pl.setBounds(174, 217, 46, 27);
		btnNewButton_Pl.addActionListener(this);
		panel.add(btnNewButton_Pl);

		btnNewButton_Mn = new JButton("-");
		btnNewButton_Mn.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Mn.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Mn.setBackground(new Color(66, 66, 66));
		btnNewButton_Mn.setBounds(174, 178, 46, 27);
		btnNewButton_Mn.addActionListener(this);
		panel.add(btnNewButton_Mn);

		
		 btnNewButton_Ml= new JButton("*");
		btnNewButton_Ml.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Ml.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Ml.setBackground(new Color(66, 66, 66));
		btnNewButton_Ml.setBounds(174, 139, 46, 27);
		btnNewButton_Ml.addActionListener(this);
		panel.add(btnNewButton_Ml);
		

		btnNewButton_Di = new JButton("/");
		btnNewButton_Di.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Di.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Di.setBackground(new Color(66, 66, 66));
		btnNewButton_Di.setBounds(174, 100, 46, 27);
		btnNewButton_Di.addActionListener(this);
		panel.add(btnNewButton_Di);
		btnNewButton_Eq = new JButton("=");
		btnNewButton_Eq.addActionListener(this);
		btnNewButton_Eq.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Eq.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Eq.setBackground(new Color(66, 66, 66));
		btnNewButton_Eq.setBounds(230, 178, 46, 66);
		panel.add(btnNewButton_Eq);
		
		btnNewButton_Sq = new JButton("sqrt");
		btnNewButton_Sq.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Sq.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Sq.setBackground(new Color(66, 66, 66));
		btnNewButton_Sq.setBounds(232, 139, 46, 27);
		btnNewButton_Sq.addActionListener(this);
		panel.add(btnNewButton_Sq);
		
		btnNewButton_Rt = new JButton("root");
		btnNewButton_Rt.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Rt.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Rt.setBackground(new Color(66, 66, 66));
		btnNewButton_Rt.setBounds(230, 100, 46, 27);
		btnNewButton_Rt.addActionListener(this);
		panel.add(btnNewButton_Rt);
		
		btnNewButton_Ln = new JButton("ln");
		btnNewButton_Ln.addActionListener(this);
		btnNewButton_Ln.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Ln.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Ln.setBackground(new Color(66, 66, 66));
		btnNewButton_Ln.setBounds(230, 60, 46, 27);
		panel.add(btnNewButton_Ln);
		
		btnNewButton_Ex = new JButton("exp");
		btnNewButton_Ex.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Ex.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Ex.setBackground(new Color(66, 66, 66));
		btnNewButton_Ex.setBounds(174, 60, 46, 27);
		btnNewButton_Ex.addActionListener(this);
		panel.add(btnNewButton_Ex);
		
		btnNewButton_Dl = new JButton("del");
		btnNewButton_Dl.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Dl.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Dl.setBackground(new Color(66, 66, 66));
		btnNewButton_Dl.setBounds(230, 21, 46, 27);
		btnNewButton_Dl.addActionListener(this);
		panel.add(btnNewButton_Dl);
		
		btnNewButton_Ac = new JButton("AC");
		btnNewButton_Ac.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_Ac.setForeground(UIManager.getColor("Button.background"));
		btnNewButton_Ac.setBackground(new Color(66, 66, 66));
		btnNewButton_Ac.setBounds(174, 21, 46, 27);
		btnNewButton_Ac.addActionListener(this);
		panel.add(btnNewButton_Ac);

	}
	public void createTheTextField() {
		//Setting up the result text field 	
		textField = new JTextField();
		textField.setMargin(new Insets(0, 20, 0, 0));
		textField.setBorder(null);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Dialog", Font.BOLD, 26));
		textField.setBounds(12, 12, 276, 50);
		textField.setColumns(10);
		this.getContentPane().add(textField);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//looping throw the numbers buttons and handling the event 
		for(int i=0 ;i<10;i++) {
			if(e.getSource()==Nbuttons[i]) {
				System.out.println(Nbuttons[i].getText());
				this.textField.setText(this.textField.getText().concat(Integer.toString(i)));
			}
		}
		//handling . button
		if(e.getSource()==btnNewButton_P) {
			if(!this.textField.getText().contains("."))this.textField.setText(this.textField.getText().concat("."));

		}
		
		//handling operations
		//handling (-/+)
		if(e.getSource()==btnNewButton_Po_Ni) {
			if(this.textField.getText().charAt(0)!='-')this.textField.setText("-"+this.textField.getText());
			else this.textField.setText(this.textField.getText().substring(1));
		}
		//+
		if(e.getSource()==btnNewButton_Pl) {
			this.operation="pl";
			this.firInp = Float.parseFloat(this.textField.getText());
			System.out.println(this.firInp);
			this.textField.setText("");
		}
		
		//-
		if(e.getSource()==btnNewButton_Mn) {
			this.operation="mn";
			this.operation="pl";
			this.firInp = Float.parseFloat(this.textField.getText());
			System.out.println(this.firInp);
			this.textField.setText("");
		}
		//*
		if(e.getSource()==btnNewButton_Ml) {
			this.operation="ml";
			this.firInp = Float.parseFloat(this.textField.getText());
			System.out.println(this.firInp);
			this.textField.setText("");
		}
		// / (division)
		if(e.getSource()==btnNewButton_Di) {
			this.operation="di";
			this.firInp = Float.parseFloat(this.textField.getText());
			System.out.println(this.firInp);
			this.textField.setText("");		
			}
		//handling special function (exp ln root sqrt);

	//Sqrt 
		if(e.getSource()==btnNewButton_Rt) {
			System.out.println("you pressed sqrt");
			this.firInp = Float.parseFloat(this.textField.getText());
			this.textField.setText("Sqrt("+this.textField.getText()+")");
			this.operation="sqrt";
					
		}
		//Sq
		if(e.getSource()==btnNewButton_Sq) {
			this.firInp = Float.parseFloat(this.textField.getText());
			this.textField.setText(this.textField.getText()+"^2");
			this.operation="sq";
					
		}
		if(e.getSource()==btnNewButton_Ln) {
			this.firInp = Float.parseFloat(this.textField.getText());
			this.textField.setText("Ln("+this.textField.getText()+")");
			this.operation="ln";
					
		}
		if(e.getSource()==btnNewButton_Ex) {
			this.firInp = Float.parseFloat(this.textField.getText());
			this.textField.setText("exp("+this.textField.getText()+")");
			this.operation="exp";
					
		}
		//start handling calculation 
		
		if(e.getSource()==btnNewButton_Eq) {
			System.out.println("operation = "+this.operation);
			//if the use pressed number1 + (=) the result will be the number1 with out any calculation
			if(this.operation==null) {
				System.out.println("first");
				this.firInp=Float.parseFloat(this.textField.getText());
				this.textField.setText(Float.toString(this.firInp));
				return ;
			}
			//special math functions exp root ln ..
			//sqrt
			if(this.operation.equals("sqrt")) {
				float res = (float) Math.sqrt(this.firInp);
				this.textField.setText(Float.toString(res));
				this.firInp=res ;
				return ;
			
			}
			//sq
			if(this.operation.equals("sq")) {
				float res = this.firInp*this.firInp;
				this.textField.setText(Float.toString(res));
				this.firInp=res ;
				return ;
			
			}
			//exp
			if(this.operation.equals("exp")) {
				float res = (float) Math.exp(this.firInp);
				this.textField.setText(Float.toString(res));
				this.firInp=res ;
				return ;
			
			}
			//ln
			if(this.operation.equals("ln")) {
				float res = (float) Math.log(this.firInp);
				this.textField.setText(Float.toString(res));
				this.firInp=res ;
				return ;
			
			}
			
			//getting the second number from the input field 
	
			this.secInput= Float.parseFloat(this.textField.getText());
			System.out.println(this.secInput);
			float res =0f; 
			if(this.operation.equals("pl")) {
				res = this.firInp+this.secInput;
			}else if(this.operation.equals("mn")) {
				res = this.firInp-this.secInput;

			}else if(this.operation.equals("ml")) {
				res = this.firInp*this.secInput;

			}else if(this.operation.equals("di")) {
				res = this.firInp/this.secInput;

			}
			
			//putting the res in the result field 
			this.textField.setText(Float.toString(res));
			//clearing the second input and setting the result to the first number
			this.firInp=res;
			this.secInput=0f;
			
		}

		//clearing  the result text field
		if(e.getSource()==btnNewButton_Ac) {
			this.firInp=0f;
			this.secInput=0f;
			this.operation=null;
			this.textField.setText("");
		}
		//deleting the last digit from 
		if(e.getSource()==btnNewButton_Dl) {
			int inputLength = this.textField.getText().length();
			if(inputLength>0)this.textField.setText(this.textField.getText().substring(0, inputLength-1));
			//if(inputLength==1)this.textField.setText("0");

		}
		
	}
}
