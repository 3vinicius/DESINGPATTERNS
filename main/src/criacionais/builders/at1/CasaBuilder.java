package criacionais.builders.at1;

public class CasaBuilder {
    public String porta;
    public String parede;
    public String cor;
    public String piso;
    public String tamanho;

    CasaBuilder setPorta(String porta){
        this.porta = porta;
        return this;
    }

    CasaBuilder setParede(String parede){
        this.parede = parede;
        return this;
    }

    CasaBuilder setCor(String cor){
        this.cor = cor;
        return this;
    }
    CasaBuilder setPiso(String piso){
        this.piso = piso;
        return this;
    }

    CasaBuilder setTamanho(String tamanho){
        this.tamanho= tamanho;
        return this;
    }

    Casa build(){
        return new Casa(this);
    }

}
