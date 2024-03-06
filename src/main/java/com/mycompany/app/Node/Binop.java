package com.mycompany.app.Node;

public class Binop extends Node{
    protected Node lChild, rChild;
    public Binop(Node l, Node r){
        this.lChild = l;
        this.rChild = r;
    }

    
}
