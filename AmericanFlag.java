import java.awt.*;
import java.applet.*;

public class AmericanFlag{

	private Rectangle union;
	private Rectangle[] stripes;
	private int scale;


	public AmericanFlag(int x, int y, int scale){
		this.scale = scale;
		this.union = new Rectangle(x,y(45*scale),(35*scale), Color.blue);
		Rectangle[] this.stripes = new Rectangle[13];
		
		for (int i=0; i<13; i++) {
			
		}
	}

	public void draw(Graphics g){
		this.union.draw(g);
		for (int i =0; ; ) {
			
		}
	}	
}