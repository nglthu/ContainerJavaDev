package com.mycompany.app;

public class Recursion {
  // Factorial n!=n(n-1)(n-2)...x3x2x1
  // Constructor
  int num;
  Recursion() {
  } // default constructor- remember ; before }
  Recursion(int number){}
  public int Recursion(int number) {
    num = number;
    if (num <= 1) // base case
      return 1;
    else
      return num * Recursion(num - 1);
  }

  

}
