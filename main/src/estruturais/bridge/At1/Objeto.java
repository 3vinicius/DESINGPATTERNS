package estruturais.bridge.At1;

import estruturais.bridge.At1.interfaces.Cor;
import estruturais.bridge.At1.interfaces.Forma;

public class Objeto {
    Cor cor;
    Forma forma;
    public Objeto(Cor cor, Forma forma) {
        this.cor = cor;
        this.forma = forma;
    }

    public void printarObjeto(){
        System.out.println(this.forma.getForma() + " " + this.cor.getCor());
    }
}
