package comportamentais.observer;

import comportamentais.observer.At1.Observer;
import comportamentais.observer.At1.Publisher;

public class Main {
    public static void main(String[] args) {
        final Publisher publisher = new Publisher();
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        publisher.addObserver(observer1);
        publisher.notifyObservers("Hello World observer 1");
        publisher.addObserver(observer2);
        publisher.notifyObservers("Hello World observers 1 e 2");
        publisher.removeObserver(observer1);
        publisher.notifyObservers("Hello World observer 2");

    }
}
