package dev.smith.hello.arrays;

import java.util.Arrays;
public class ArrayPlayground {

    public static void main (String[] args) {


        // Declare an array
        int[] intArray = new int[5]; // an array of length 5

        // Array literal
        int[] otherArray = {1, 2, 3, 6, 7, 5, 12, 100, 9349393, 577};

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(otherArray));
    }
}
