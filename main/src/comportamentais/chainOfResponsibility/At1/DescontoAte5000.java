package comportamentais.chainOfResponsibility.At1;

public class DescontoAte5000 extends Desconto{
    public DescontoAte5000(Desconto desconto) {
        super(desconto);
    }

    @Override
    public double calcularDesconto(double valor) {
        if (valor > 5000){
            return  valor * 0.15;
        }
        if (super.temNext()){
            super.calcularDesconto(valor);
        }
        return 0;
    }
}
