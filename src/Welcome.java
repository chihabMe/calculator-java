
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome  implements ActionListener{
 JFrame window  = new JFrame();
 JButton start = new JButton("start");
 ImageIcon linuxIcon = new ImageIcon("linux.png");
 JLabel linux = new JLabel();
 Welcome(){
	 window.setSize(300,350);
	 window.setLocationRelativeTo(null);
	 window.setIconImage(linuxIcon.getImage());
	 window.setResizable(false);
	 window.setLayout(null);
	 window.getContentPane().setBackground(new Color(66,66,66));
	 start.addActionListener(this);
	 start.setBackground(new Color(42,32,32));
	 start.setForeground(new Color(200,200,200));
	 start.setFocusable(false);
	 this.linux.setIcon(linuxIcon);
	 this.linux.setText("linux");
	 this.linux.setForeground(new Color(200,200,200));
	 this.start.setBounds((int)(300/2)-50,(int)(350/2)-40,100,40);
	 
	 this.linux.setBounds((int)(300/2)-35,(int)(350/2),150,100);
	 window.add(linux);
	 window.add(start);
	 
	 window.setVisible(true);
 }
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==start) {
		new Window();
		window.dispose();
	}
}
}
