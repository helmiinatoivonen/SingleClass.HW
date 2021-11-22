package com.company;

import ibcsutils.Book;

public class Main {

    public static void main(String[] args)
    {   /*
        // Exercise 1
        2. Encapsulation refers to the inclusion of both data and actions
           into a single component.
        3. Java primitive data types for real numbers: float and double
        4. Long can represent a wider range of values than int, what's max
           value is 2,147,483,647 (while int only occupies 32 bits of memory,
           long occupies 64 bits of memory
        5. methods are member functions and fields are member variables
        */
        // Exercise 2
        Book fantasy = new Book("title", new String[] {"Lastname", "Firstname"}, 2006);
        System.out.println (fantasy);
        Book trueCrime = new Book("another title", new String[] {"lastName", "firstName"}, 1987);
        System.out.println (trueCrime);
    }
}
