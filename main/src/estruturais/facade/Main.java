package estruturais.facade;

import estruturais.facade.At1.CaixasDeSom;
import estruturais.facade.At1.Controle;
import estruturais.facade.At1.DVD;
import estruturais.facade.At1.Tv;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle(new CaixasDeSom(),new DVD(), new Tv());
        controle.iniciar();
        controle.pausar();
    }
}
