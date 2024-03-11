package com.mycompany.app.NameCollision;

public class C2 implements InterfaceTest1, interfaceTest2{

    @Override
    public int f(int i) {
       return 1;
    }

    @Override
    public void f() {
        System.out.println("Implement for Interface 1");
    }
    
}
