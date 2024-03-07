package com.mycompany.app.Callback;

public class CalleeTest implements Increment{
    private int i=0;
    public void inMeth(){
        i++;
        System.out.println("Callee with i"+i);

    }

    
}
