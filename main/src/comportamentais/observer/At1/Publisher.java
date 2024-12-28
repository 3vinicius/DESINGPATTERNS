package comportamentais.observer.At1;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Observer> observerList = new ArrayList<Observer>();

   public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
       observerList.remove(observer);
    }

    public void notifyObservers(String message){
       observerList.forEach(observer -> {
           observer.message(message);
       });
    }
}
