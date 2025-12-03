package org.example.creational.AbstractFactory;



// concrete products
public class WindowsCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
