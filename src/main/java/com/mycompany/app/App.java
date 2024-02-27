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


public class App {
    public static void main(String[] args) {
       

        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
        Student myStu = new Student();
        myStu.StudentID = "abcd";
        System.out.println(myStu.StudentID);
        Time myTime = new Time();
        int a = 12;
        myTime.setHour(a);
        System.out.println(myTime.stringToScreen());

        Recursion myFactorial = new Recursion(3);
        System.out.println(myFactorial);
        
        List myList = new List();
      
        
    }
}


