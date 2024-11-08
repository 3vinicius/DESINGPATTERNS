package estruturais.adapter.At1;

public class SistemaPagamentoAtual implements Pagamento{

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado");
    }
}
