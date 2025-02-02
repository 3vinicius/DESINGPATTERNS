package criacionais.builders.at1;

public class Casa{
    private String porta;
    private String parede;
    private String piso;
    private String cor;
    private String tamanho;

    public Casa(String porta, String parede, String piso, String cor, String tamanho) {
        this.porta = porta;
        this.parede = parede;
        this.piso = piso;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Casa(CasaBuilder casaBuilder) {
        this.porta = casaBuilder.porta;
        this.parede = casaBuilder.parede;
        this.piso = casaBuilder.piso;
        this.cor = casaBuilder.cor;
        this.tamanho = casaBuilder.tamanho;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getParede() {
        return parede;
    }

    public void setParede(String parede) {
        this.parede = parede;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "porta='" + porta + '\'' +
                ", parede='" + parede + '\'' +
                ", piso='" + piso + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
