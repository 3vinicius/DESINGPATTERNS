package comportamentais.memento.At1;

public class Snapshot {
    Estados estado;
    Long numEstado;

    public Snapshot(Estados estado, Long numEstado) {
        this.estado = estado;
        this.numEstado = numEstado;
    }

    public void restore(){
        estado.setNumEstado(numEstado);
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public Long getNumEstado() {
        return numEstado;
    }

    public void setNumEstado(Long numEstado) {
        this.numEstado = numEstado;
    }
}
