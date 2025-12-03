package org.example.creational.abstractMethod;

public abstract class Dialog {
    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton() ;

}
