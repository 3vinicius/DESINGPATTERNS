package comportamentais.chainOfResponsibility.At1;

public abstract class Desconto {
    Desconto next;

    public Desconto(Desconto desconto) {
        this.next = desconto;
    }

    public Boolean temNext(){
        if (next != null){
            return true;
        }
        return false;
    }


    public double calcularDesconto(double valor){
          return  next.calcularDesconto(valor);
    }
}



