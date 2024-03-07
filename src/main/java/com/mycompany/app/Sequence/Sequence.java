package com.mycompany.app.Sequence;

import com.mycompany.app.Sequence.*;
public class Sequence {
    // array of Object
    private Object [] obj;
    private int next = 0;
    
    public Sequence(int size){
        obj = new Object[size];
    }
    //set content
    public void add(Object x){
        if(next<obj.length) {obj[next] = x; next ++;}
    }
    //inner class of Subsequence
    private class SSelector implements Selector{
        int i = 0;

        @Override
        public boolean end() {
            return i == obj.length;
        }

        @Override
        public Object current() {
            return obj[i];
        }

        @Override
        public void next() {
            if(i<obj.length) i++;
        }

        //end, current, next
    }
    
    public Selector getSelector(){
        return new SSelector();
    }

    //anonymous Inner Class
    
}
