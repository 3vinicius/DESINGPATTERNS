package estruturais.proxy.At1;

public class ProxyPagamento implements Pagavel{

    Pagamento pagamento;
    Boolean autorizado;
    public ProxyPagamento(String pagamento) {
       if (pagamento.equals("AUTENTICADO")){
           autorizado = true;
           System.out.println("Usuario está autenticado para o pagamento");
       } else {
           autorizado = false;
           System.out.println("Usuario não está autenticado para o pagamento");
       }
    }

    @Override
    public void realizarPagamento() {
        if (autorizado) {
            if (pagamento == null) {
                this.pagamento = new Pagamento();
            }
            pagamento.realizarPagamento();
            autorizado = false;
        } else {
            System.out.println("Usuario não autorizado");
        }
    }
}
