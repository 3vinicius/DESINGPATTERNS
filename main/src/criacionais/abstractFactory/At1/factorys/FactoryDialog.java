package criacionais.abstractFactory.At1.factorys;

import criacionais.abstractFactory.At1.interfaces.Dialog;
import criacionais.abstractFactory.At1.model.DialogLinux;
import criacionais.abstractFactory.At1.model.DialogMac;
import criacionais.abstractFactory.At1.model.DialogWindowns;

public class FactoryDialog {
    public Dialog dialogWindowns(){
        return new DialogWindowns();
    }
    public Dialog dialogLinux(){
        return new DialogLinux();
    }

    public Dialog dialogMac(){
        return new DialogMac();
    }
}
