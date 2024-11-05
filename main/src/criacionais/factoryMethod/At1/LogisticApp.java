package criacionais.factoryMethod.At1;

public class LogisticApp {
//    Você precisa impletar factoryMethod
//    A classe factory deve construir os objetos para Navio e Caminhão

    public static void main(String[] args){
        FactoryTransport fabricaTransportes = new FactoryTransport();
        System.out.println(fabricaTransportes.deliveryNavio().delivery());
        System.out.println(fabricaTransportes.deliveryCaminhao().delivery());
    }

}
