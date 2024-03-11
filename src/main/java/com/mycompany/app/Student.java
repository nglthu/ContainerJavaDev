package com.mycompany.app;

//This: refer to the current object and method in the program
public class Student {
      String Name;
      String StudentID;
      int Mark;
      Student() { }	; // default constructor
      public String Student(String Name, String StudentID, int Mark) {
      this.Name = Name;
      this.StudentID = StudentID;
      this.Mark = Mark;

      return StudentID;

    }
  
  }
  