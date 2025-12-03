package org.example.creational.FactoryMethod;

public class MobileDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new MobileButton();
    }
}
