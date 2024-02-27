package com.mycompany.app;

// Factorial n!=n(n-1)(n-2)...x3x2x1
public class Recursion {
  int num;

  // Constructor
  Recursion() {
  } // default constructor- remember ; before }

  Recursion(int number) {
  } // constructor for int

  public int Recursion(int number) {
    num = number;
    if (num <= 1) // base case
      return 1;
    else
      return num * Recursion(num - 1);
  }

}
