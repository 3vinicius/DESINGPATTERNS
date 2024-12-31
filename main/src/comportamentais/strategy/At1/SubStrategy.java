package comportamentais.strategy.At1;

public class SubStrategy implements Strategy {
    @Override
    public Integer execute(Integer numberA, Integer numberB) {
        return numberA - numberB;
    }
}
