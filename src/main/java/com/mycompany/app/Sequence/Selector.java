package com.mycompany.app.Sequence;

public interface Selector {
    boolean end();
    Object current();
    void next();
    
}
