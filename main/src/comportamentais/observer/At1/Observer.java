package comportamentais.observer.At1;

public class Observer implements Notify{
    @Override
    public void message(String message) {
        System.out.println(message);
    }
}
