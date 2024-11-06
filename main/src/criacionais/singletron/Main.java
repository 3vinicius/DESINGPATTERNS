package criacionais.singletron;

public class Main {
    public static void main(String[] args) {
        CasaSingle casaSingle1 = CasaSingle.getInstance("test","test","test","test","trdy");
        System.out.println(casaSingle1.toString());
        CasaSingle casaSingle2 = CasaSingle.getInstance("asda","sdf","thfghf","tfghgf","hfghf");



    }


}
