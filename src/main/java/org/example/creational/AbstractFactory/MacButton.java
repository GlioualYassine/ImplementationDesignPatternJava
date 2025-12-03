package org.example.creational.AbstractFactory;


// concrete products
public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}
