/**
 * Created by deepaksood619 on 22/6/16.
 */
public class StockObserver implements Observer {

    private double ibmPrice;
    private double appPrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("new observer created "+this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double applPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.appPrice = applPrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    private void printThePrices() {
        System.out.println("observerID: "+observerID +
        "\nIBM: "+ibmPrice + "\nAppl: "+appPrice + "\nGoog: "+googPrice);
    }


}
