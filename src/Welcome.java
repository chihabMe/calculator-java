
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Welcome  implements ActionListener{
 JFrame window  = new JFrame();
 JButton start = new JButton("start");
 Welcome(){
	 window.setSize(300,350);
	 window.setResizable(false);
	 start.addActionListener(this);
	 start.setBackground(new Color(44,44,44));
	 start.setForeground(new Color(200,200,200));
	 start.setFocusable(false);
	 window.add(start);
	 window.setVisible(true);
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==start) {
		new Window();
		window.dispose();
	}
}
}
