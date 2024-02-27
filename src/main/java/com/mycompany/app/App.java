/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
//Book and App is under the package app

//import java.sql.Date;
import java.util.Date;
import java.lang.Math;
//import built class
import Book;



public class App {
    public static void main(String[] args) {
        int SiSoLop;
        SiSoLop = 40;
        Date d = new Date();
        double ran = Math.random();
        System.out.println(SiSoLop);
        System.out.println(d);
        System.out.println(ran);

        Book myObj = new Book("a","b",2);
        System.out.println(myObj.title);
    }
}


