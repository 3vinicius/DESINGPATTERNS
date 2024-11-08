package estruturais.proxy;

import estruturais.proxy.At1.Pagamento;
import estruturais.proxy.At1.Pagavel;
import estruturais.proxy.At1.ProxyPagamento;

public class Main {
    public static void main(String[] args) {
        Pagavel pagamento = new ProxyPagamento("AUTENTICADO");
        pagamento.realizarPagamento();
        pagamento.realizarPagamento();
    }
}
