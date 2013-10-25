import java.awt.*;
import java.applet.*;

public class AmericanFlag{

	private Rectangle union;
	private Rectangle[] stripes;
	private int scale;


	public AmericanFlag(int x, int y, int scale){
		this.scale = scale;
		this.union = new Rectangle(x,y,(scale*99),(scale*60), Color.blue);
		this.stripes = new Rectangle[13];
		
		for (int i = 0; i < 13 ; i++ ) {
			if (i % 2 == 0) {
				stripes[i] = new Rectangle(x, (i + 1) * 10 + y, (int)(scale * 247),(int)(scale * 10), Color.red);
						
			}else{
				stripes[i] = new Rectangle(x, (i + 1) * 10 +y, (int)(scale * 247),(int)(scale * 10), Color.white);
			}		
		}
	}

	public void draw(Graphics g){
		for (int i = 0; i < 13; i++) {
			stripes[i].draw(g);
		}
		this.union.draw(g);
	}	
}