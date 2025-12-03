package org.example.creational.Singleton;

public class ClientSingleton {
    public static void main(String[] args) {
        Config config = Config.getInstance();

        config.showConfig();
    }
}
