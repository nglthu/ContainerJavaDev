/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
//Book and App is under the package app
import com.mycompany.app.*;
//import java.sql.Date;
import java.util.Date;
import java.lang.Math;
//import user-built class
import Book;
import Student;
import Time;
import Recursion;
import List;
import com.mycompany.app.InnerClass;
import com.mycompany.app.Person;


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
        
    }
}


