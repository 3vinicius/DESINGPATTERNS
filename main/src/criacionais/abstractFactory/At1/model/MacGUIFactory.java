package criacionais.abstractFactory.At1.model;

import criacionais.abstractFactory.At1.interfaces.Button;
import criacionais.abstractFactory.At1.interfaces.CheckBox;
import criacionais.abstractFactory.At1.interfaces.Dialog;
import criacionais.abstractFactory.At1.interfaces.GUIFactory;

public class MacGUIFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new ButtonMac();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxMax();
    }

    @Override
    public Dialog createDialog() {
        return new DialogMac();
    }
}
