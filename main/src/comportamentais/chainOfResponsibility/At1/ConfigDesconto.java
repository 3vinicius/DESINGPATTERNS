package comportamentais.chainOfResponsibility.At1;

public class ConfigDesconto {
    public static Desconto desconto(){
        Desconto descontoChaiResp = new DescontoAte10000(new DescontoAte5000(new DescontoAte1000(new SemDesconto())));
        return descontoChaiResp;
    }
}
