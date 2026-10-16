package com.pluralsight;


public class CompareNumbers {
    public static void main(String[] args) {
//      Even Numbers
        System.out.println(isEven(5));
        System.out.println(isEven(10));

//      Positive Number
        System.out.println(isPositive(3.5));
        System.out.println(isPositive(-2.0));
        System.out.println(isPositive(0));

    }

    public static boolean isEven(int number) {
        return number > 0;

    }

    public static boolean isPositive(double number) {
        return number > 0;

    }
}

// Create a new file named CompareNumbers.java
// a. Create a main() method
// b. Create this method: isEven(int number)
//      a. returns true if even
// c. Create: isPositive(double number)
//      a. returns true if > 0
// d. Call these within a System.out.println() in main() to check if your
//methods work or not. EX. System.out.println(isEven(5)); should
//display false