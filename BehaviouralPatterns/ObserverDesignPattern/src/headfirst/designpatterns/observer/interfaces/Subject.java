package headfirst.designpatterns.observer.interfaces;

public interface Subject {
	
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
	
}
