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
            return i == obj.length
        }

        @Override
        public Object current() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'current'");
        }

        @Override
        public void next() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'next'");
        }
        //end, current, next

    }

    //anonymous Inner Class
    
}
