package com.mycompany.app.Sequence;

public class SequenceA {
    // array of Object
    private Object [] obj;
    private int next = 0;
    private int size;
   
    SequenceA(){}
    
    public SequenceA(int size){
        obj = new Object[size];
    }
    //set content
    public void add(Object x){
        if(next<obj.length) {obj[next] = x; next ++;}
    }
    //inner class of Subsequence
    private class SSelector implements SelectorA{
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

    public SelectorA getSelector(){
        return new SSelector();
    }

    //anonymous Inner Class
    
}
