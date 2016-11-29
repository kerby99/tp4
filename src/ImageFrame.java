import java.awt.Graphics;

import javax.swing.JFrame;

public class ImageFrame extends JFrame implements Observer {

	private ModelImage image;
	
	public ImageFrame(ModelImage image){
		this.image = image;
		image.addObserver(this);
	}
	
	/**
	 * 
	 */
	public void paint(Graphics g){
		super.paint(g);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	
}
