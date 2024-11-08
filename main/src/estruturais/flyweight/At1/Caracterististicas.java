package estruturais.flyweight.At1;

public class Caracterististicas {
    String poder;
    String tamanho;

    public Caracterististicas(String poder, String tamanho) {
        this.poder = poder;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Caracterististicas{" +
                "poder='" + poder + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
