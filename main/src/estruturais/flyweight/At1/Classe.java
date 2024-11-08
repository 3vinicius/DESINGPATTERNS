package estruturais.flyweight.At1;

import java.util.ArrayList;
import java.util.HashMap;

public class Classe {
    String valor;
    private static final HashMap<String, String> listaClasses = new HashMap<>();

    static  {
        listaClasses.put(" "," ");
    }

    public void inserirClase(String valor){
        if (!listaClasses.containsKey(valor)){
            this.valor = valor;
            listaClasses.put(valor,valor);
        }
    }

    public String pegarClase(String valor){
        if (listaClasses.containsKey(valor)){
            this.valor = valor;
            return listaClasses.get(valor);
        }
        this.valor = " ";
        return listaClasses.get(" ");
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "Classe='" + listaClasses + '\'' +
                '}';
    }
}
