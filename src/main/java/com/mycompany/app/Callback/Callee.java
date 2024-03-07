package com.mycompany.app.Callback;

public class Callee implements IncreamentableInterface{
    private int i=0;
    void incrementMethod(){
        i++;
        System.out.println("Callee with i"+i);

    }

    
}
