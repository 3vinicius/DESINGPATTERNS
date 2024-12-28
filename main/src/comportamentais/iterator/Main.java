package comportamentais.iterator;

import comportamentais.iterator.At1.AlgoritmoDePares;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalList = List.of(5, 1, 4, 2, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> listPares = new AlgoritmoDePares(originalList).listPares();
        System.out.println(listPares);
    }
}
