import java.util.List;

public class ModelPerspective implements Observable {

	private float zoom;
	private float[] translation;
	private List<Observer> observers;
	
	
	public ModelPerspective(){
		
	}

	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers){
			observer.update();
		}	
	}


	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}


	/**
	 * @return the zoom
	 */
	public float getZoom() {
		return zoom;
	}


	/**
	 * @param zoom the zoom to set
	 */
	public void setZoom(float zoom) {
		this.zoom = zoom;
		notifyObservers();
	}
	
}
