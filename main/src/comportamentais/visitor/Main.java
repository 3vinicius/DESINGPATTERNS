package comportamentais.visitor;

import comportamentais.visitor.At1.Casa;
import comportamentais.visitor.At1.Loja;
import comportamentais.visitor.At1.Predio;
import comportamentais.visitor.At1.Visitor;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();
        Casa casa = new Casa();
        Predio predio = new Predio();

        Visitor visitor = new Visitor();

        loja.construir(visitor);
        casa.construir(visitor);
        predio.construir(visitor);
    }
}
