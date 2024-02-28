/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
//Package com.mycompany.app
package com.mycompany.app;

//Import the whole class belong to the package of com.mycompay.app
import com.mycompany.app.*;

//Import built-in class
import java.util.Date;

import javax.naming.Name;

import java.lang.Math;

//import user-built specific class
import Book;
import Student;
import Time;
import Recursion;
import List;
import com.mycompany.app.InnerClass;
import com.mycompany.app.Person;
import com.mycompany.app.NNCollection;
import NameNumber;


public class App {
    public static void main(String[] args) {
       
        //Test Book
        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
        Student myStu = new Student();
        myStu.StudentID = "abcd";
        System.out.println(myStu.StudentID);

        //Test Time
        Time myTime = new Time();
        int a = 12;
        myTime.setHour(a);
        System.out.println(myTime.stringToScreen());
        
        //Test recursion
        int num = 3;
        Recursion myFactorial = new Recursion(num);
        myFactorial.Recursion(num);
        System.out.println("test recursion:1x2.."+"x"+num+ "="+myFactorial.Recursion(num));

        //Test List
        List myList = new List();

        //Test inner class
        InnerClass test = new InnerClass();// class
        InnerClass.doSomething test2 = test.new doSomething();
        System.out.println(test2.i + " " + test2.s);
        InnerClass.Flower test3 = test.new Flower("hi", 47);
        System.out.println(test3.s + " " + test3.petalCount);
        
        //Test Person
        Person per = new Person();
        per.setName("ABC");
        System.out.println(per.getName());
        
        //Test Number Name Collection
        //Instantiate the array of Object
        NameNumber [] nn = new NameNumber[2];
        //To do: bug Name Number
        //set new value
        nn[0] = new NameNumber("John Doe", "0919191919");
        nn[1] = new NameNumber("John Doe", "919");
        String lastName = nn[0].getLastName();
        String number = nn[0].getTelNumber();

        NNCollection nnC = new NNCollection();
        nnC.insert(nn[0]); 
        nnC.insert(nn[1]); 
        String numFind = nnC.findNumber(lastName);
        /* 
        shift-option a
        */
        System.out.println(numFind);
        
    }
}


