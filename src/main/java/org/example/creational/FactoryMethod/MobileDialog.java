package org.example.creational.abstractMethod;

public class MobileDialog extends Dialog {

    @Override
    protected Button createButton() {
        return new MobileButton();
    }
}
