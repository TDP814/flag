import java.awt.*;
import java.applet.*;

public class AmericanFlag{

	private Rectangle union;
	private Rectangle[] stripes;
	private int scale;


	public AmericanFlag(int x, int y, int scale){
		this.scale = scale;
		this.union = new Rectangle(x,(y+(int)(this.scale*10)),(int)(this.scale*99),(int)(this.scale*70), Color.blue);
		this.stripes = new Rectangle[13];
		
		for (int i = 0; i < 13 ; i++ ) {
			if (i % 2 == 0) {
				stripes[i] = new Rectangle(x, (int)((i + 1) * this.scale*10 + y), (int)(this.scale * 247),(int)(this.scale * 10), Color.red);		
			}else{
				stripes[i] = new Rectangle(x, (int)((i + 1) * this.scale*10 + y), (int)(this.scale * 247),(int)(this.scale * 10), Color.white);
			}
		}
	}

	public void draw(Graphics g) {
		for (int i = 0; i < 13; i++) {
			stripes[i].draw(g);
		}
		this.union.draw(g);
	}	
}