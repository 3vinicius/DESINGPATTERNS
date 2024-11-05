package criacionais.factoryMethod.At2;

public class FactoryButton {
    Button buttonWindowns(){
        return new ButtonWin();
    }
    Button buttonMac(){
        return new ButtonMac();
    }
    Button buttonLinux(){
        return new ButtonLinux();
    }
}
