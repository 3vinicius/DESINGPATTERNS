package comportamentais.chainOfResponsibility.At1;

public class DescontoAte10000 extends Desconto {
    public DescontoAte10000(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcularDesconto(double valor) {
        if (valor > 10000){
            return valor * 0.20;
        }
        if (super.temNext()){
            super.calcularDesconto(valor);
        }
        return 0;
    }
}
