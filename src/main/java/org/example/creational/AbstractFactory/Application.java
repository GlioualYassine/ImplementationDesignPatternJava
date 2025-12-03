package org.example.creational.AbstractFactory;

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}
