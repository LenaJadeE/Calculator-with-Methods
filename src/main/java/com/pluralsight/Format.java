package com.pluralsight;

public class Format {
    public static void main(String[] args){

        System.out.println(formatName("Bob","Smith"));

        String formattedName = formatName("Bob", "Smith");
        System.out.println(formattedName);



    }
}








//Create a new file named Format.java
//a. Create a main() method
//b. Create this method: formatName(String first, String last)
//a. It should RETURN "Last, First" format
//b. Example: formatName("Bob", "Smith") returns "Smith, Bob"
//c. Call it in your main and put it in the () of a System.out.println().
//Bonus: set the return of the method call in a variable and print that!