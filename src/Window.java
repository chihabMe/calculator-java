import javax.swing.JFrame;

public class Window extends JFrame  {
	private final int width = 300;
	private final int height = 400;
	
	Window(){
		this.setTitle("java sucks ! ");
		this.setSize(width,height);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setVisible(true);
	}
}
