package org.example.creational.FactoryMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("je suis une HTML button");
    }
}
