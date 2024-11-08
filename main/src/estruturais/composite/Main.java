package estruturais.composite;

import estruturais.composite.At1.Caixa;
import estruturais.composite.At1.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Produto> list1 = new ArrayList<>();
        List<Produto> list2 = new ArrayList<>();
        List<Produto> list3 = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            list1.add(new Produto(8F));
            list2.add(new Produto(2F));
            list3.add(new Produto(10F));
        }

        Caixa caixa1 = new Caixa(list1);
        Caixa caixa2 = new Caixa(list2);
        Caixa caixa3 = new Caixa(list3);

        System.out.println("O valor da caixar 1, 2 e 3 e 2 da caixa 1, 5 da caixa 2 e 7 da caixa 3");
        Float total = caixa1.valor() + caixa2.valor() + caixa3.valor() +
                (2F * list1.get(0).valor()) +
                (5F * list2.get(0).valor()) +
                (7F * list3.get(0).valor());
        System.out.println(total);

    }
}
