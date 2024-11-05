package criacionais.abstractFactory.At1.factorys;

import criacionais.abstractFactory.At1.interfaces.Button;
import criacionais.abstractFactory.At1.model.ButtonLinux;
import criacionais.abstractFactory.At1.model.ButtonMac;
import criacionais.abstractFactory.At1.model.ButtonWindowns;

public class FactoryButton {
    Button ButtonLinux(){
        return new ButtonLinux();
    }

    Button ButtonWind(){
        return new ButtonWindowns();
    }

    Button ButtonMac(){
        return new ButtonMac();
    }
}
