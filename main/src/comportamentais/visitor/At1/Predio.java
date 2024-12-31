package comportamentais.visitor.At1;

public class Predio implements Construcao{
    @Override
    public void construir(Visitor visitor) {
        visitor.construirPredio(this);
    }
}
