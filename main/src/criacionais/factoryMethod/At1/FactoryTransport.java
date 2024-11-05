package criacionais.factoryMethod.At1;

public class FactoryTransport {
    public Navio deliveryNavio(){
        return new Navio();
    }
   public Caminhao deliveryCaminhao(){
        return new Caminhao();
    }
}
