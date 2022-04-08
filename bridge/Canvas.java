package bridge;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.add(new Canvas());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void paint(Graphics graphics) {
		Square square=new Square(new GreenColorShape());
		square.draw(graphics);
		
		Circle circle = new Circle(new RedColorShape());
		circle.draw(graphics);
	}
}
