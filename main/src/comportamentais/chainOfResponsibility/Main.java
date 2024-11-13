package comportamentais.chainOfResponsibility;

import comportamentais.chainOfResponsibility.At1.ConfigDesconto;

public class Main {
    public static void main(String[] args) {
        System.out.println(ConfigDesconto.desconto().calcularDesconto(200));
    }
}
