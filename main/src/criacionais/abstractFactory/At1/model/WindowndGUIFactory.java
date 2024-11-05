package criacionais.abstractFactory.At1.model;

import criacionais.abstractFactory.At1.interfaces.Button;
import criacionais.abstractFactory.At1.interfaces.CheckBox;
import criacionais.abstractFactory.At1.interfaces.Dialog;
import criacionais.abstractFactory.At1.interfaces.GUIFactory;

public class WindowndGUIFactory implements GUIFactory {


    @Override
    public Button createButton() {
        return new ButtonWindowns();
    }

    @Override
    public CheckBox createCheckBox() {
        return new CheckBoxWindowns();
    }

    @Override
    public Dialog createDialog() {
        return new DialogWindowns();
    }
}
