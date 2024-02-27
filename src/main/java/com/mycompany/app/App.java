/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
//Book and App is under the package app

//import java.sql.Date;
import java.util.Date;
import java.lang.Math;
//import user-built class
import Book;
import Student;



public class App {
    public static void main(String[] args) {
       

        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
        Student myStu = new Student();
        myStu.StudentID = "abcd";
        System.out.println(myStu.StudentID);
    }
}


