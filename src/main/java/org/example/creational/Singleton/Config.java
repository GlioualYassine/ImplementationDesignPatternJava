package org.example.creational.Singleton;

public class Config {
    public static Config instance ;

    private Config(){
        // interdir utilisation du constructeur
    }

    public static Config getInstance(){
        if(instance == null){
            instance = new Config();
        }
        return instance;
    }

    public void showConfig(){
        System.out.println("config recupérée");
    }

}
