package criacionais.abstractFactory.At1.model;

import criacionais.abstractFactory.At1.interfaces.Button;

public class ButtonMac implements Button {
    @Override
    public String click() {
        return "click button mac";
    }
}
