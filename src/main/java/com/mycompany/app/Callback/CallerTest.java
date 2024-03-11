package com.mycompany.app.Callback;

public class CallerTest {
    private Increment callBackRef;
    CallerTest(){}
    
    public CallerTest(Increment ref){
        callBackRef = ref;

    }
    public void go(){
       System.out.println("test"+callBackRef);
       ((CalleeTest) callBackRef).inMeth();


    }

    
}
