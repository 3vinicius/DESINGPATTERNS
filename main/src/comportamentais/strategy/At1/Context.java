package comportamentais.strategy.At1;

public class Context implements Strategy{
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public Integer execute(Integer numberA, Integer numberB) {
        return strategy.execute(numberA, numberB);
    }
}
