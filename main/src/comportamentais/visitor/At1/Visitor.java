package comportamentais.visitor.At1;

public class Visitor {


    public void construirCasa(Casa casa){
        System.out.println("construir casa");
        System.out.println(casa.toString());
    }

    public void construirLoja(Loja loja){
        System.out.println("construir loja");
        System.out.println(loja.toString());
    }

    public void construirPredio(Predio predio){
        System.out.println("Construir predio");
        System.out.println(predio.toString());
    }

}
