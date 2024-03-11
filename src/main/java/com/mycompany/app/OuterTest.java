package com.mycompany.app;

public class OuterTest {
    int var1;
    public class InnerTest{
        InnerTest(int var1){} //no return type, no access modifier
        public int InnerTest(int var1){
            this.var1 = var1;
            return var1;
        }
        

    }
    
}
