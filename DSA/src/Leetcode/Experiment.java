package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Experiment {
    public static void main(String[] args) {
        int[][]arr = {
                {1,3},
                {2,6},
                {8,10},
                {15,16},
        };
        int[][]ans = merge(arr);
        for(int[]hero: ans){
            System.out.println(Arrays.toString(hero));
        }
        int[]arr2 = new int[]{3,2,3};
        cyclicSort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
        System.out.println(majorityElement2(new int[]{3,2,3}));

    }


    public static int[][] merge(int[][] arr) {
        int[][] ans = new int[arr.length][2];
        int key = 0;
        for (int i = 1; i < arr.length; i++) {
            int[] first = arr[i - 1];
            int[] second = arr[i];

            int L1 = first[0];
            int R1 = first[1];
            int L2 = second[0];
            int R2 = second[1];

            if (L1 <= L2 && R1 >= L2) {
                int[] local = {L1, R2};
                ans[key] = local;
                key += 1;
            } else {
                ans[key] = second;
                key += 1;
            }
        }

        // Create a new array with the correct size, excluding trailing [0,0] elements
        int[][] result = new int[key][2];
        System.arraycopy(ans, 0, result, 0, key);
        return result;
    }
    static void  cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void  swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int majorityElement(int[] nums) {
        double sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        double answer = sum/nums.length;
        System.out.println(answer);
        return (int)Math.ceil(answer);
    }

    public static List<Integer> majorityElement2(int[] nums) {
        // BEST APPROACH
        int count1 = 0;
        int maj1 = Integer.MIN_VALUE;
        int count2 = 0;
        int maj2=Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i=0 ;i<nums.length;i++){
            if(count1 == 0 && nums[i]!=maj2){
                maj1 = nums[i];
                count1 = 1;
            }else if(count2 == 0 && nums[i]!=maj1){
                maj2 = nums[i];
                count2 = 1;
            }
            else if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i]==maj2){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for(int i: nums){
            if(i==maj1){
                count1++;
            }
            if(i==maj2){
                count2++;
            }
        }

        if(count1>nums.length/3){
            list.add(maj1);
        }
        if(count2>nums.length/3){
            list.add(maj2);
        }

        return list;
    }
}

