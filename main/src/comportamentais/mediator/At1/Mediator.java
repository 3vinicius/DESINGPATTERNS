package comportamentais.mediator.At1;

import java.util.HashMap;
import java.util.Map;

public class Mediator {
    ComponentLogin login = new ComponentLogin();
    ComponetDadosUser dadosUser =  new ComponetDadosUser();
    Map<String, Object> dadosFormularios = new HashMap<String, Object>();

    public Mediator() {
        dadosFormularios.put("login", this.login.login);
        dadosFormularios.put("senha", this.login.senha);
        dadosFormularios.put("altura", this.dadosUser.altura);
        dadosFormularios.put("idade", this.dadosUser.idade);
    }

    public void dadosDoFormulario(){
        System.out.println(dadosFormularios.toString());
    }
}
