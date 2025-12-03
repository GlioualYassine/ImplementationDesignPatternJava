package org.example.creational.abstractMethod;

public class WebDialog extends Dialog {


    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
