package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Question75 {
    public static void main(String[] args) {
        int[]arr= {2,0,2,1,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[]arr) {
        int numOfZero = 0;
        int numOfOne = 0;
        int numOfTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                numOfZero += 1;
            } else if (arr[i] == 1) {
                numOfOne += 1;
            } else {
                numOfTwo += 1;
            }
        }
        int k = 0;
        for (int i = 0; i < numOfZero; i++) {
            arr[k++] = 0;
        }
        for (int i = 0; i < numOfOne; i++) {
            arr[k++] = 1;
        }

        for (int i = 0; i < numOfTwo; i++) {
            arr[k++] = 2;
        }
    }
}



