//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     //Q1/ Write a Java program to test if the first and the last element of an array of
        //integers are same. The length of the array must be greater than or equal to
        //2 Test Data:

        int[] array = {50, -20, 0, 30, 40, 60, 10};

       

            // are first and last elements the same
            if (array[0] == array[array.length - 1]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }




        //Q2/ Write a Java program to find the numbers greater than the average of the
        //numbers of a given array.

        // Define the given array
        int[] numbers = {1, 4, 17, 7, 25, 3, 100};

        // Calculate the sum of all elements
        int totalSum = 0;
        for (int num : numbers) {
            totalSum += num;
        }

        //Calculate the average
        int average =  totalSum / numbers.length;
        System.out.println("The average of the said array is: " + average);

      // Find numbers greater than the average
        System.out.println("Number greater than the average is:  ");
        for (int num : numbers) {
            if (num > average) {
                System.out.println(num);
            }
        }



    // Q3/ Write a Java program to get the larger value between first and last
        //element of an array of integers.


        int[] numBers = {20, 30, 40};

        // Check if the array length is at least 1
        if (numBers.length >= 1) {
            // Get the first and last elements
            int firstElement = numBers[0];
            int lastElement = numBers[numBers.length - 1];

            // Check the larger value
            int largerValue = Math.max(firstElement, lastElement);


            System.out.println("Larger value: " + largerValue);
        }
//Q4/ Write a Java program to swap the first and last elements of an array and
//create a new array.

        int[] originalArray = {20, 30, 40};

        // is  array has at least two elements
        if (originalArray.length >= 2) {
            // Create a new array and copy the original array into it
            int[] swappedArray = Arrays.copyOf(originalArray, originalArray.length);

            // // Switch the initial and final components.
            int temp = swappedArray[0];
            swappedArray[0] = swappedArray[swappedArray.length - 1];
            swappedArray[swappedArray.length - 1] = temp;



            System.out.println("New Array  " + Arrays.toString(swappedArray));
        }

    //Q5//  Write a program that places the odd elements of an array before the
        //even elements.


        int[] Numbers = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        int[] result = new int[Numbers.length];

        int oddIndex = 0;
        int evenIndex = 0;

        // Count the odd numbers first
        for (int num : Numbers) {
            if (num % 2 != 0) {
                evenIndex++;
            }
        }

        // Rearrange the numbers
        for (int num : Numbers) {
            if (num % 2 != 0) {
                result[oddIndex] = num;
                oddIndex++;
            } else {
                result[evenIndex] = num;
                evenIndex++;
            }
        }


        System.out.println( Arrays.toString(result));


        //Q6/ Write a program that test the equality of two arrays.

        int[] array1 = {2, 3, 6, 6, 4};
        int[] array2 = {2, 3, 6, 6, 4};

        // Check if the arrays
        boolean areEqual = true;

        // Check if both arrays have the same length
        if (array1.length != array2.length) {
            areEqual = false;
        } else {
            // Compare each element of both arrays
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }


        System.out.println( areEqual);
        }

    }
