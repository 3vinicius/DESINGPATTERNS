package comportamentais.strategy;

import comportamentais.strategy.At1.Context;
import comportamentais.strategy.At1.MultStrategy;
import comportamentais.strategy.At1.SubStrategy;
import comportamentais.strategy.At1.SumStrategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        String strategy = "SUM";

        context.setStrategy(new SumStrategy());
        System.out.println(context.execute(2,5));


        context.setStrategy(new SubStrategy());
        System.out.println(context.execute(2,5));

        context.setStrategy(new MultStrategy());
        System.out.println(context.execute(2,5));
    }
}
