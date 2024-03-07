package com.mycompany.app.Callback;

public class Caller {
    private IncreamentableInterface callBackRef;
    Caller(){}
    
    public Caller(IncreamentableInterface increRef){
        this.callBackRef = increRef;

    }
    public void go(){
        this.callBackRef.incrementMethod();

    }

    
}
