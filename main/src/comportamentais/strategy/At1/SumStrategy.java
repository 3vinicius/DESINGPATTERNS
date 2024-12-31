package comportamentais.strategy.At1;

public class SumStrategy implements Strategy{
    @Override
    public Integer execute(Integer numberA, Integer numberB) {
        return numberA + numberB;
    }
}
