package org.example.creational.abstractMethod;

public class ClientFactoryMethod {
    public static void main(String[] args) {

        Dialog dialog = new MobileDialog();
        dialog.renderWindow();

        dialog = new WebDialog();
        dialog.renderWindow();


    }
}
