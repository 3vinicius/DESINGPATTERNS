package criacionais.abstractFactory.At1.model;

import criacionais.abstractFactory.At1.interfaces.CheckBox;

public class CheckBoxLinux implements CheckBox {
    @Override
    public String check() {
        return "Check Box Linux ";
    }
}
