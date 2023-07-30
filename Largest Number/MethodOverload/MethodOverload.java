/**
 * MethodOverload
 */
package Class;
// package com.example;

class Summation {
    int Add(int a, int b) {
        int Sum = a + b;
        System.out.println(Sum);
        return 0;
    }

    int Add(int a, int b, int c) {
        int Sum = a + b + c;
        System.out.println(Sum);
        return 0;
    }

    int Add(int a, int b, int c, int d) {
        int Sum = a + b + c + d;
        System.out.println(Sum);
        return 0;
    }
}

class MethodOverload {
    public static void main(String[] args) {

        Summation Obj = new Summation();

        Obj.Add(5, 8);
        Obj.Add(8, 9, 7);
        Obj.Add(5, 0, 8, 9);

    }

}