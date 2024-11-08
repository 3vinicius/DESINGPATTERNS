package estruturais.flyweight.At1;

public class Personagem {
    String classe;
    Caracterististicas caracterististicas;

    public Personagem(String classe, Caracterististicas caracterististicas) {
        this.classe = classe;
        this.caracterististicas = caracterististicas;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "classe=" + classe.toString() +
                ", caracterististicas=" + caracterististicas.toString() +
                '}';
    }
}
