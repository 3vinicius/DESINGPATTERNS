package estruturais.composite.At1;

public class Produto implements Compravel{
    private Float valor;

    public Produto(Float valor) {
        this.valor = valor;
    }

    @Override
    public Float valor() {
        return valor;
    }
}
