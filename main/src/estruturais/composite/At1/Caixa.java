package estruturais.composite.At1;

import java.util.List;

public class Caixa implements Compravel{

    List<Produto> produtoList;
    private Float valor;

    public Caixa(List<Produto> produtoList) {
        this.produtoList = produtoList;
        this.valor = 0.0F;
    }

    public void contarProdutos(){
        for (Produto p:
             produtoList) {
            valor += p.valor();
        }
    }

    @Override
    public Float valor() {
        return valor;
    }


}
