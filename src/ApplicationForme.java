import java.util.List;

import javax.swing.JFrame;

public class ApplicationForme extends JFrame {
	private ImageFrame thumbrail;
	private List<PerspectiveFrame> perspectives;
	private Menu menu;
	private ModelImage modelImage;
	private ModelPerspective modelesPerspectives;
	
	
	public static void main(String[] args){
		ApplicationForme applicationForme = new ApplicationForme();
	}
	
	public ApplicationForme(){
		menu = new Menu();
		modelImage = new ModelImage();
		thumbrail = new ImageFrame(modelImage);
		modelesPerspectives = new ModelPerspective();
	}
	

}
