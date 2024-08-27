package com.phaete;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {

        /**
         * Content
         */
        int[] ints = new int[2];
        int[] ints2 = {1,2};

        // Wrapper Klassen
        // int wird zu Integer
        List<Integer> list = new ArrayList<>(); // new Integer[0]

        // Add an element to the list
        list.add(1); // list wird zu new Integer[1] und list[0] wird auf 1 gesetzt
        list.add(3); // list wird zu new Integer[2] und list[1] wird auf 3 gesetzt
        list.add(5); // list wird zu new Integer[3] und list[2] wird auf 5 gesetzt

        // Remove and element from the list
        list.remove(1); // removes element at index
        list.remove(Integer.valueOf(5)); // removes element with value 5

        // If the list has multiple elements with the same value and we want to remove them all, we have to count them first and then remove them in a loop
        List<Integer> numbers = new ArrayList<>(
            Arrays.asList(
                0, 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
            )
        );

        /* aquivalent to
        List<Integer> numbers = new ArrayList<>();

         */

        // count all 6-es
        int count = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 6) {
                count++;
            }
        }
        System.out.println("Count: " + count);

        // remove all but one of those 6-es
        for (int i = 0; i < count-1; i++) {
            numbers.remove(Integer.valueOf(6));
        }

        // add a new element at a specific index
        list.add(2, 100);

        // size of list
        int size = list.size();

        // get data
        Integer x = list.get(2); // returns 100, as we just added the Integer 100 at index 2

        // for loop with incrementing index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // for each loop
        for (Integer i : list) {
            System.out.println(i);
        }

        list.add(100, 1909);

        System.out.println(list);

        /**
         * Challenges
         */

        List<Student> studentList = new ArrayList<>();
        Student peter = new Student("peter", "parker", 1);
        studentList.add(peter);

        Student bruce = new Student("bruce", "wayne", 2);
        studentList.add(bruce);

        Student tony = new Student("tony", "stark", 3);
        studentList.add(tony);



    }
}