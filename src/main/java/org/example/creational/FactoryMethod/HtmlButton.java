package org.example.creational.abstractMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("je suis une HTML button");
    }
}
