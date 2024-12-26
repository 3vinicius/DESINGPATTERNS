package comportamentais.memento;

import comportamentais.memento.At1.Estados;
import comportamentais.memento.At1.Snapshot;

public class Main {
    public static void main(String[] args) {
        Estados estados = new Estados(1);
        Snapshot snapshot1 = estados.criarSnapshot();
        estados.setNumEstado(10);
        System.out.println("Estado atual = "+ estados.getNumEstado());
        System.out.println("Estado anterior = "+ snapshot1.getNumEstado());
        snapshot1.restore();
        System.out.println("Estado atual feito restore = "+ estados.getNumEstado());

    }
}
