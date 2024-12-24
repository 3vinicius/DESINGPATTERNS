package comportamentais.comander;

import comportamentais.comander.At1.Http;

public class Main {
    public static void main(String[] args) {
        Http response = new Http("Ligar");
        response.processarRequisicao();
    }
}
