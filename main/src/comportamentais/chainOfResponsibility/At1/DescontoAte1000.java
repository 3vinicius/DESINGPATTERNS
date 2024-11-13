package comportamentais.chainOfResponsibility.At1;

public class DescontoAte1000 extends Desconto{
    public DescontoAte1000(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcularDesconto(double valor) {
        if (valor > 1000){
            return valor * 0.1;
        }
        if (super.temNext()){
            return super.calcularDesconto(valor);
        }
        return 0;
    }
}
