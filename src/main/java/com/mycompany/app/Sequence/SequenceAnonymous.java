package com.mycompany.app.Sequence;

public class SequenceAnonymous {
    // array of Object
    private Object [] obj;
    private int next = 0;
    private int size;
   
    SequenceAnonymous(){}
    
    public SequenceAnonymous(int size){
        obj = new Object[size];
    }
    //set content
    public void add(Object x){
        if(next<obj.length) {obj[next] = x; next ++;}
    }
    //inner class of Subsequence
    

    public SelectorA getSelector(){
        return new SelectorA(){
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
        };
    }

    //anonymous Inner Class
    
}
