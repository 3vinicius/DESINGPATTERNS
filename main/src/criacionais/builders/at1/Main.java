package criacionais.builders.at1;

public class Main {
    public static void main(String[] args) {
        Casa casa = new CasaBuilder()
                .setParede("uma parede")
                .setCor("Verde")
                .setPiso("porcelanato")
                .setTamanho("2000")
                .build();
        System.out.println(casa.toString());

    }
}
