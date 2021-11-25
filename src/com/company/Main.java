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

        // Exercise 2
        Book fantasy = new Book("title", new String [] {"Lastname", "Firstname"}, 2006);
        System.out.println (fantasy);
        Book trueCrime = new Book("another title", new String [] {"lastName", "firstName"}, 1987);
        System.out.println (trueCrime);

        // Exercise 3

        Newspaper theGuardian = new Newspaper ("The Guardian", 2021, 3, 12, true);
            System.out.println (theGuardian);

        // Exercise 4

        Course GlobalPolitics = new Course ("International law", "Global Politics", "Huxley", -7, false);
        System.out.println (GlobalPolitics);
        */
        // Exercise 5

        Point one = new Point (new int[] {1, 0}, new int[] {1, 0}); // coordinates of point one and also some other point
        System.out.println (one);
    }
}
