package criacionais.abstractFactory.At1;

import criacionais.abstractFactory.At1.interfaces.GUIFactory;
import criacionais.abstractFactory.At1.model.LinuxGUIFactory;
import criacionais.abstractFactory.At1.model.MacGUIFactory;
import criacionais.abstractFactory.At1.model.WindowndGUIFactory;

public class EditorApp {
    static GUIFactory factory;
    public static void main(String[] args) {
         String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacGUIFactory();
        }
        else if (osName.contains("win")) {
            factory = new WindowndGUIFactory();
        }
        else if (osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
            factory = new LinuxGUIFactory();
        }

        System.out.println(factory.createButton().click());
        System.out.println(factory.createCheckBox().check());
        System.out.println(factory.createDialog().show());
    }
}
