package com.mycompany.app.Actor;

public class Stage {
    Actor a = new HappyActor();
    public void change (){
        a = new SadActor();
    }
    public void go(){
        a.act();
    }
    
}
