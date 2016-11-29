import java.util.List;

public class ModelImage implements Observable {

	private String urlImage;
	private List<Observer> observers;
	
	public ModelImage(){	
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
	 * @return the urlImage
	 */
	public String getUrlImage() {
		return urlImage;
	}

	/**
	 * @param urlImage the urlImage to set
	 */
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
		notifyObservers();
	}
	
	
}
