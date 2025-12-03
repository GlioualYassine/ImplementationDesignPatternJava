package org.example.creational.AbstractFactory;


// concrete products
public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Mac Checkbox painted");
    }
}
