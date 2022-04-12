import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame implements ActionListener  {
	private final int width = 320;
	private final int height = 350;
	private float firstInp ;
	private float SecInp ;
	private String Operation;
	JButton Nbuttons[] = new JButton[12];
	JButton OPButtons[] = new JButton[6];

	int topWidth = this.width;
	int topHeight = (int)(0.15*this.height);
	int centerWidth = this.width;
	int centerHeiht = (int)(0.15*this.height);
	
	int bottomWidth = this.width;
	int bottomHeight = (int)(0.7*this.height);
	
	private JPanel BottomLeft = new JPanel();
	private JPanel BottomRight = new JPanel();
	
	Window(){
		this.firstInp=0;
		this.SecInp=0;
		this.setTitle("java sucks ! ");
		this.getContentPane().setBackground(new Color(66,66,66));
		this.setSize(width,height);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		//start adding the panels 
		createTop();
		//createCenter();
		createBottom();
		this.setLayout(null);
		this.setVisible(true);
	
	}
	
	private void createBottom() {
		JPanel Bottom = new JPanel();
		Bottom.setBackground(Color.PINK);
		Bottom.setBounds(0,this.centerHeiht,this.bottomWidth,this.bottomHeight);
		Bottom.setLayout(null);
		//creating the left/right side 
		//1:left side  ?=[numbers]
		
		JPanel BottomLeft = new JPanel();
		BottomLeft.setLayout(new GridLayout(3,3,10,30));
		BottomLeft.setBounds(0,0,(int)(this.bottomWidth*0.7),this.bottomHeight);
		BottomLeft.setBackground(new Color(66,66,66));
		//list of buttons 
		for(int i=0;i<10;i++) {
			String buttonName = " "+i;
			JButton numberButton = new JButton(buttonName);
			numberButton.addActionListener(this);
			numberButton.setBackground(new Color(55,55,55));
			numberButton.setFocusable(false);
			numberButton.setForeground(Color.white);
			
			//numberButton.setSize(40,40);
		//	numberButton.setMaximumSize(new Dimension(23,23));
			Nbuttons[i]=numberButton;
			BottomLeft.add(numberButton);
		}
		//adding = and .
		
		JButton PButton = new JButton(".");
		Nbuttons[10]=PButton;
		
		JButton EqButton = new JButton("=");
		Nbuttons[11]=EqButton;
		PButton.setBackground(new Color(55,55,55));
		PButton.addActionListener(this);
		PButton.setFocusable(false);
		PButton.setForeground(Color.white);
		EqButton.setBackground(new Color(55,55,55));
		EqButton.setFocusable(false);
		EqButton.addActionListener(this);
		EqButton.setForeground(Color.white);
		BottomLeft.add(PButton);
		BottomLeft.add(EqButton);
		
		
		//2:right side ?=[operations]
		JPanel BottomRight = new JPanel();
		BottomRight.setBackground(new Color(66,66,66));

		BottomRight.setLayout(new GridLayout(3,6,0,0));
		BottomRight.setBounds((int)(this.bottomWidth*0.7),0,(int)(this.bottomWidth*0.3),this.bottomHeight);

		//buttons 
		JButton ACButton  = new JButton("AC");
		JButton DIVButton  = new JButton("/");
		JButton MULutton  = new JButton("*");
		JButton ADButton  = new JButton("+");
		JButton SBButton  = new JButton("-");
		JButton EXButton  = new JButton("EXP");
		
		this.OPButtons[0] = ACButton;
		this.OPButtons[1] = DIVButton;
		this.OPButtons[2] = MULutton;
		this.OPButtons[3] = ADButton;
		this.OPButtons[4] = SBButton;
		this.OPButtons[5] = EXButton;
		
		
		
		//ACButton.setSize(new Dimension(50,50));
//		ACButton.setFocusable(false);
//		int x_pos =0;
//		int y_pos=0;
//		boolean t = true ;
		for(int i=0;i<6;i++) {
			OPButtons[i].setFont(new Font(null,Font.PLAIN,10));
			OPButtons[i].setFocusable(false);
				
			OPButtons[i].setBackground(new Color(55,55,55));
			OPButtons[i].setForeground(new Color(200,200,200));
			OPButtons[i].addActionListener(this);
			
		}
		

		
		BottomRight.add(ACButton);
		BottomRight.add(DIVButton);
		BottomRight.add(MULutton);
		BottomRight.add(ADButton);
		BottomRight.add(SBButton);
		BottomRight.add(EXButton);
		
		//start adding to the bottom panel
				
		Bottom.add(BottomRight);		
		Bottom.add(BottomLeft);
		
		//
		this.add(Bottom);
	}
	
	private void createCenter() {
		JPanel Center = new JPanel();
		Center.setBackground(Color.gray);
		Center.setBounds(0,this.topHeight,this.centerWidth,this.centerHeiht);
		this.add(Center);
	}
	private void createTop() {
		JPanel Top = new JPanel();

		Top.setBounds(0,0,this.topWidth,this.topHeight);
		this.add(Top);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource()==this.Nbuttons[i]) {
				System.out.println(i);
				if(this.Operation==null) {
				this.firstInp=i;
				}else {
					this.SecInp=i;
				}
			}
		}
		if(e.getSource()==Nbuttons[11]) {
		System.out.println(calculate());	
		}
		if(e.getSource()==this.OPButtons[0]) {
			System.out.println("clear");
			this.firstInp=0;
			this.SecInp=0;
			this.Operation=null;
		}
		if(e.getSource()==this.OPButtons[1]) {
			System.out.println("div");
			this.Operation="div";
		}
		if(e.getSource()==this.OPButtons[2]) {
			System.out.println("mul");
			this.Operation="mul";
		}
		
		
		if(e.getSource()==this.OPButtons[3]) {
			System.out.println("add");
			this.Operation="add";
		}
		
		if(e.getSource()==this.OPButtons[4]) {
			System.out.println("sub");
			this.Operation="sub";
		}
		if(e.getSource()==this.OPButtons[5]) {
			System.out.println("exp");
			this.Operation="exp";
		}
		
		
		if(e.getSource()==this.OPButtons[5]) {
			this.Operation="exp";
			
		}
	}
	private float calculate() {
		System.out.println(this.Operation);
		float res = 0;
		if(this.Operation.equals("div")) {
			res = this.firstInp/this.SecInp;
		}
		if(this.Operation.equals("mul")) {
			res = this.firstInp*this.SecInp;
		}
		
		if(this.Operation.equals("add")) {
			res = this.firstInp + this.SecInp;
		}
		
		if(this.Operation.equals("sub")) {
			res = this.firstInp-this.SecInp;
		}
		if(this.Operation.equals("exp")) {
			res = (float) Math.exp(this.firstInp);
		}
		this.firstInp=0f;
		this.SecInp=0f;
		this.Operation=null;
		return res;
	}

}
