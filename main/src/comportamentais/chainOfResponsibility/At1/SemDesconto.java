package comportamentais.chainOfResponsibility.At1;

public class SemDesconto extends Desconto{


    public SemDesconto() {
        super(null);
    }

    @Override
    public double calcularDesconto(double valor) {
        return 0;
    }
}
