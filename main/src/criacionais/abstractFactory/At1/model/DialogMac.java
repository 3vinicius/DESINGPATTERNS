package criacionais.abstractFactory.At1.model;

import criacionais.abstractFactory.At1.interfaces.Dialog;

public class DialogMac implements Dialog {
    @Override
    public String show() {
        return "Dialog MAc";
    }
}
