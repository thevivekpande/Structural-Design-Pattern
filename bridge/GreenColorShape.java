package bridge;

import java.awt.Color;
import java.awt.Graphics;

public class GreenColorShape implements ColorShape {
	
	public void setColor(Graphics graphics) {
		graphics.setColor(Color.green);
	}
}
