package com.mycompany.app.Glyph;

public abstract class Glyph {
    abstract void draw();  //method abstract
    Glyph(){
        System.out.println("before draw()");
        draw();
        System.out.println("after draw()");
    }
}
