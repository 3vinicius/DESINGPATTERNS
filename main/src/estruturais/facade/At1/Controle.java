package estruturais.facade.At1;

public class Controle {
    CaixasDeSom caixasDeSom;
    DVD dvd;
    Tv tv;

    public Controle(CaixasDeSom caixasDeSom, DVD dvd, Tv tv) {
        this.caixasDeSom = caixasDeSom;
        this.dvd = dvd;
        this.tv = tv;
    }

    public void pausar(){
        caixasDeSom.pararSom();
        dvd.pararDVD();
        tv.pararTV();
    }
    public void iniciar(){
        caixasDeSom.iniciarSom();
        dvd.iniciarDVD();
        tv.iniciarTV();
    }
}
