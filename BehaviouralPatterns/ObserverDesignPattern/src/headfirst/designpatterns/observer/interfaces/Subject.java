package headfirst.designpatterns.observer.interfaces;

/*
Observer D.P:
-------------
Define a one-to-many dependency between objects so that when one object
changes state, all its dependents are notified and updated automatically.
*/

public interface Subject {

	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();

}
