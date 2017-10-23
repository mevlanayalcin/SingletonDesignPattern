package com.company;

public class SingletonSinifi {


    private static SingletonSinifi singletonSinifiObjesi=new SingletonSinifi();

    private SingletonSinifi(){
    }

    public static SingletonSinifi getInstance(){

        return singletonSinifiObjesi;
    }

    public void goster()
    {
        System.out.println("Merhaba ben Singleton Sinifina ait bir methodum");
    }







}
