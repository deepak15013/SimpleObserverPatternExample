import java.util.ArrayList;

/**
 * Created by deepaksood619 on 22/6/16.
 */

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {

        observers.add(newObserver);

    }

    @Override
    public void unregister(Observer deleteObserver) {

        int observerIndex = observers.indexOf(deleteObserver);

        System.out.println("observer delete: "+observerIndex+1);

        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }

    }

    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
