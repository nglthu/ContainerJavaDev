package com.mycompany.app;

//This: refer to the current object and method in the program
public class Time {
      int hour;
      //int minute;
      //int second;
      Time() { setTime(0)}	; // default constructor
      Time setTime(int h){
      setHour(h);
      }
      Time setHour(int h){
        hour = ((h>=0 && h<24)?h:0);
        return this;
      }
      int getHour(){return hour};
    



    }
  
  }
  