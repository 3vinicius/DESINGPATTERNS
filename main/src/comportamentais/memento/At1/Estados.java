package comportamentais.memento.At1;

public class Estados {
    private long numEstado;


    public long getNumEstado() {
        return numEstado;
    }


     public  void setNumEstado(long numEstado) {
        this.numEstado = numEstado;
    }

    public Estados(long estado) {
        this.numEstado = estado;
    }

    public Snapshot criarSnapshot(){
        return new Snapshot(this, numEstado);
    }
}
