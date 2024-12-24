package comportamentais.comander.At1;

public class Http {
    private final String  request;

    public Http(String request) {
        this.request = request;
    }

    public void processarRequisicao(){
        if (this.request.toUpperCase().contains("LIGAR")){
            System.out.println("O progama vai ligar");

        } else if (this.request.toUpperCase().contains("DESLIGAR")) {
            System.out.println("O progama vai desligar");
        }
        else {
            System.out.println("Comando não identificado ");
        }
    }
}
