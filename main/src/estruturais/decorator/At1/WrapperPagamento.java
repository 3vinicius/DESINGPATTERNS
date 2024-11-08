package estruturais.decorator.At1;

public class WrapperPagamento {
    private Pagamento oldPagamento;

    public WrapperPagamento(Pagamento oldPagamento) {
        this.oldPagamento = oldPagamento;
    }

    public String newPagamento(){
        return "new Pagamento";
    }
}
