package comportamentais.templateMethody;

import comportamentais.templateMethody.At1.ServiceDados;
import comportamentais.templateMethody.At1.ServiceUser;
import comportamentais.templateMethody.At1.TempleteService;

public class Main {
    public static void main(String[] args) {
        TempleteService templeteService = new TempleteService();
        String response1 = templeteService
                .setService(new ServiceUser())
                .executeService()
                .montarResponse()
                .getResponseEntity();
        System.out.println(response1);


        String response2 = templeteService
                .setService(new ServiceDados())
                .executeService()
                .montarResponse()
                .getResponseEntity();
        System.out.println(response2);

    }
}
