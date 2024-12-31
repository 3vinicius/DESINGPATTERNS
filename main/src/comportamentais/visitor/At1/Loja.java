package comportamentais.visitor.At1;

public class Loja implements Construcao{
    @Override
    public void construir(Visitor visitor) {
        visitor.construirLoja(this);
    }
}
