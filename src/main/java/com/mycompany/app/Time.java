package com.mycompany.app;

//This: refer to the current object and method in the program
public class Time {
  int hour;
  // int minute;
  // int second;

  //Constructor
  Time() { setTime(0);} // default constructor
  Time(int h){setTime(h);}

  Time setTime(int h) {
    setHour(h);
    return this; // return value
  }

  Time setHour(int h) {
    hour = ((h >= 0 && h < 24) ? h : 0);
    return this;
  }

  int getHour(){return hour};

  public int stringToScreen() {
    return hour;
  }

}


