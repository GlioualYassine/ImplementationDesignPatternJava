package org.example.creational.FactoryMethod;

public class WebDialog extends Dialog {


    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
