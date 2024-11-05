package criacionais.factoryMethod.At2;

public class editorApp {
    public static void main(String[] args) {
        FactoryButton factoryButton = new FactoryButton();
        System.out.println(factoryButton.buttonLinux().clickar());
        System.out.println(factoryButton.buttonWindowns().clickar());
        System.out.println(factoryButton.buttonMac().clickar()
        );
    }
}
