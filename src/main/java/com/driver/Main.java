package com.driver;

public class Main {

    public static class A
    {
        public String meth()
        {
            return "invoking method from class A";
        }
    }

    public static class B extends A
    {

    }

    public static void main(String args[])
    {
        B obj1 = new B();
        obj1.meth();



    }
}