package org.example.creational.AbstractFactory;

public class Demo {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name").toLowerCase();
        GuiFactory factory;

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new Macfactory();
        }


        Application application = new Application(factory);

        application.render();
    }
}
