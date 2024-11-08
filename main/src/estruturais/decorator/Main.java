package estruturais.decorator;

import estruturais.decorator.At1.Pagamento;
import estruturais.decorator.At1.WrapperPagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();
        WrapperPagamento wrapperPagamento = new WrapperPagamento(pagamento);
        System.out.println(wrapperPagamento.newPagamento());
    }
}
