package estruturais.adapter.At1;

public class AdapterSistemaDePagamentoAntigo implements Pagamento {
    private final SistemaPagamentoAntigo sistemaPagamentoAntigo;
    public AdapterSistemaDePagamentoAntigo(SistemaPagamentoAntigo sistemaPagamentoAntigo) {
        this.sistemaPagamentoAntigo = sistemaPagamentoAntigo;
    }

    @Override
    public void pagar() {
        System.out.println(sistemaPagamentoAntigo.getPagamento());
    }
}
