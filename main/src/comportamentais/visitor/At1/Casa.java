package comportamentais.visitor.At1;

public class Casa implements Construcao{

    @Override
    public void construir(Visitor visitor) {
        visitor.construirCasa(this);
    }
}
