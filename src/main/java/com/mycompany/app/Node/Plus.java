package com.mycompany.app.Node;

public class Plus extends Binop{
    public Plus(Node l, Node r){
        super(l,r);
    }
    public double eval(){
        System.out.println("lChild + rChild value" + lChild.eval()+rChild.eval());
        return lChild.eval()+rChild.eval();
    }
    public int testPlus = 10;
    
}
