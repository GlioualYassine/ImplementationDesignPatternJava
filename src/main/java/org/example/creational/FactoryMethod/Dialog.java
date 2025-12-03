package org.example.creational.FactoryMethod;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton() ;

}
