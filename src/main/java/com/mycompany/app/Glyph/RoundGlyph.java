package com.mycompany.app.Glyph;

public class RoundGlyph extends Glyph{
    int radius ;

    //set radius
    public RoundGlyph(int r){
        this.radius = r;


    }
    public void draw (){
        System.out.println("Round Glyph draw method "+ this.radius);
    }
    
}
