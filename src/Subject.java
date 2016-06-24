/**
 * Created by deepaksood619 on 22/6/16.
 */
public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}
