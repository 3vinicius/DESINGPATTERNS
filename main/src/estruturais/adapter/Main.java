package estruturais.adapter;

import estruturais.adapter.At1.AdapterSistemaDePagamentoAntigo;
import estruturais.adapter.At1.Pagamento;
import estruturais.adapter.At1.SistemaPagamentoAntigo;
import estruturais.adapter.At1.SistemaPagamentoAtual;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoAtual = new SistemaPagamentoAtual();
        Pagamento pagamentoAntigo = new AdapterSistemaDePagamentoAntigo(new SistemaPagamentoAntigo());
        pagamentoAtual.pagar();
        pagamentoAntigo.pagar();
    }
}
