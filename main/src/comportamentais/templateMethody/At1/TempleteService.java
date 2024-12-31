package comportamentais.templateMethody.At1;

public class TempleteService {
    private Service service;
    private String request;
    private String response;
    private String responseEntity;
    private final ServiceResponse serviceResponse = new ServiceResponse();



    public TempleteService setService(Service service) {
        this.service = service;
        return this;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public TempleteService executeService(){
        this.response = service.execute().toString();
        return this;
    }

    public TempleteService montarResponse(){
        this.responseEntity = serviceResponse.montarResponse(response);
        return this;
    }
    public String getResponseEntity() {
        return responseEntity;
    }
}
