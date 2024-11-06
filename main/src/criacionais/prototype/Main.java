package criacionais.prototype;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("bosta","","test","test5","");
        Casa casa2 = casa1.clone();
        casa2.setCor("rosa");

        System.out.println(casa1);
        System.out.println(casa2);
    }
}
