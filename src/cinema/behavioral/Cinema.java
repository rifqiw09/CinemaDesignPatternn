package cinema.behavioral;

import java.util.ArrayList;
import java.util.List;

public class Cinema implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String newMovie;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("New movie released: " + newMovie);
        }
    }

    public void setNewMovie(String movie) {
        this.newMovie = movie;
        notifyObservers();
    }
}
