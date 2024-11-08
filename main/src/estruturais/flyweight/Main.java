package estruturais.flyweight;

import estruturais.flyweight.At1.Caracterististicas;
import estruturais.flyweight.At1.Classe;
import estruturais.flyweight.At1.Personagem;

public class Main {
    public static void main(String[] args) {
        Classe classe = new Classe();
        classe.inserirClase("Mago");
        classe.inserirClase("Guerreiro");
        classe.inserirClase("Tank");

        Caracterististicas caracterististicas = new Caracterististicas("mais de 10 mil", "90m");
        Personagem personagem1 = new Personagem(classe.pegarClase("Mago"),caracterististicas);
        Personagem personagem2 = new Personagem(classe.pegarClase("Mago"),caracterististicas);
        Personagem personagem3 = new Personagem(classe.pegarClase("bosta"),caracterististicas);
        Personagem personagem4 = new Personagem(classe.pegarClase("Guerreiro"),caracterististicas);
        System.out.println(personagem1.toString());
        System.out.println(personagem2.toString());
        System.out.println(personagem3.toString());
        System.out.println(personagem4.toString());
        System.out.println(classe.toString());
    }
}
