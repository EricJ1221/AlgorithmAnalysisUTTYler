/**
 *
 * Eric Oliver
 * 10/14/23
 * Programming Assignment 1 - Algorithm Analysis
 *
 *
 *
 *
 *
 *
 *
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int MAX_VALUE = 100;
        int[] myArray1 = new int[10]; // Example: Create an array of size 10
        RandomArrayGenerator.Generate(myArray1, MAX_VALUE); // Populate the array with random integers and a max value

        int[] myArray2 = new int[100]; // Example: Create an array of size 10
        RandomArrayGenerator.Generate(myArray2, MAX_VALUE); // Populate the array with random integers and a max value

        int[] myArray3 = new int[1000]; // Example: Create an array of size 10
        RandomArrayGenerator.Generate(myArray3, MAX_VALUE); // Populate the array with random integers and a max value

        int[] myArray4 = new int[10000]; // Example: Create an array of size 10
        RandomArrayGenerator.Generate(myArray4, MAX_VALUE); // Populate the array with random integers and a max value

        System.out.println();
        System.out.println("Sorting Algorithm: Bubble Sort");
        System.out.println("Number of Values in array: " + myArray1.length);
        EnhancedBubbleSort.improvedBubbleSort(myArray1);
        for( int num : myArray1)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray2.length);
        EnhancedBubbleSort.improvedBubbleSort(myArray2);
        for( int num : myArray2)
            System.out.print(num + ", ");
        System.out.println(); // I am unsure why I need two of these for one blank line in my output
        System.out.println();


        System.out.println("Number of Values in array: " + myArray3.length);
        EnhancedBubbleSort.improvedBubbleSort(myArray3);
        for( int num : myArray3)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray4.length);
        EnhancedBubbleSort.improvedBubbleSort(myArray4);
        for( int num : myArray4)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println("Sorting Algorithm: Selection Sort");
        System.out.println("Number of Values in array: " + myArray1.length);
        SelectionSort.selectionSort(myArray1);
        for( int num : myArray1)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray2.length);
        SelectionSort.selectionSort(myArray2);
        for( int num : myArray2)
            System.out.print(num + ", ");
        System.out.println(); // I am unsure why I need two of these for one blank line in my output
        System.out.println();


        System.out.println("Number of Values in array: " + myArray3.length);
        SelectionSort.selectionSort(myArray3);
        for( int num : myArray3)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray4.length);
        SelectionSort.selectionSort(myArray4);
        for( int num : myArray4)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println();
        System.out.println("Sorting Algorithm: Comb Sort");
        System.out.println("Number of Values in array: " + myArray1.length);
        CombSort.combSort(myArray1);
        for( int num : myArray1)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray2.length);
        CombSort.combSort(myArray2);
        for( int num : myArray2)
            System.out.print(num + ", ");
        System.out.println(); // I am unsure why I need two of these for one blank line in my output
        System.out.println();


        System.out.println("Number of Values in array: " + myArray3.length);
        CombSort.combSort(myArray3);
        for( int num : myArray3)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();

        System.out.println("Number of Values in array: " + myArray4.length);
        CombSort.combSort(myArray4);
        for( int num : myArray4)
            System.out.print(num + ", ");
        System.out.println();
        System.out.println();


        /*System.out.println("Array of 10 random Integers below 100");
        for( int num : myArray1)
            System.out.println(num);
        System.out.println("");*/


        //EnhancedBubbleSort.improvedBubbleSort(myArray1);
        //SelectionSort.selectionSort(myArray1);
        //CombSort.combSort(myArray1);

        // Statement to print out array after sorting to check if sorted, obviously not at this time
        //for( int num : myArray1)
           // System.out.print(num + ", ");
        //System.out.println("");





    }
}
