public class Main {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197);
        stockGrabber.setApplPrice(199);
        stockGrabber.setGoogPrice(201);

        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197);
        stockGrabber.setApplPrice(199);
        stockGrabber.setGoogPrice(201);

        stockGrabber.unregister(observer);

        stockGrabber.setIbmPrice(197);
        stockGrabber.setApplPrice(199);
        stockGrabber.setGoogPrice(201);
    }
}
