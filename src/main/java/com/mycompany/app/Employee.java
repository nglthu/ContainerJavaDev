package com.mycompany.app;

import java.util.Date;

public class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    public boolean equalsTest(Object testObj){
        if(this == testObj) return true;
        if (testObj == null) return false;
        if(getClass()!=testObj.getClass()) return false;

        Employee other = (Employee)testObj;
        return name.equals(other.name) && salary == other.salary && hireDay.equals(other.hireDay);

    }
    
}
