package com.mycompany.app;

public class InnerClass {

    // Java Inner classes
    // Class doSomething inside HelloWorld

   /*  public static void main(String[] args) {

        InnerClass test = new InnerClass();// class
        InnerClass.doSomething test2 = test.new doSomething();
        System.out.println(test2.i + " " + test2.s);
        InnerClass.Flower test3 = test.new Flower("hi", 47);
        System.out.println(test3.s + " " + test3.petalCount);
    }
    */
    class doSomething {
        int i = 13;
        String s = "hello world";

    }

    class Flower {
        int petalCount = 0;
        String s = new String("null");

        Flower() {
        }

        Flower(int petals) {
            petalCount = petals;
        }

        Flower(String ss) {
            s = ss;
        }

        Flower(String s, int petals) {
            this.s = s;
            this.petalCount = petals;

        }

    }

}
