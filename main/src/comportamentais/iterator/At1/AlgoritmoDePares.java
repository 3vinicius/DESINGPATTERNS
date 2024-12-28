package comportamentais.iterator.At1;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmoDePares implements Iterator {
    List<Integer> cache;
    Integer currentPosition;

    public AlgoritmoDePares(List<Integer> listInter) {
        cache = listInter;
        currentPosition = 0;
    }

    @Override
    public Integer getNext() {
        if (hasNext()){
            Integer element = cache.get(currentPosition);
            currentPosition++;
            return element;
        }
        return null;
    }

    @Override
    public Boolean hasNext() {
        return currentPosition < cache.size();
    }

    public List<Integer> listPares(){
        List<Integer> listaOrdenada = new ArrayList<Integer>();
        while (hasNext()){
            Integer element = getNext();
            if (element % 2 == 0){
                listaOrdenada.add(element);
            }
        }
        return listaOrdenada;
    }
}
