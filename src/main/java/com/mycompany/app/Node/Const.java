package com.mycompany.app.Node;

public class Const extends Node{
    private double val;
    public Const(double d){
        val = d;
    }
    public double eval(){
        return val;
    }
    
}
