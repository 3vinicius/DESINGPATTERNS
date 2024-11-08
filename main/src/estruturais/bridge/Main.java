package estruturais.bridge;

import estruturais.bridge.At1.Objeto;
import estruturais.bridge.At1.model.Azul;
import estruturais.bridge.At1.model.Quadrado;

public class Main {
    public static void main(String[] args) {
//        Nesse exmeplo tanto a cor quanto a forma são abstração
        // a cor concreta como Azul e Quadrado, são implementações
        // Objeto, também seria minha abstração

        Objeto objeto = new Objeto(new Azul(),new Quadrado());
        objeto.printarObjeto();
    }
}
