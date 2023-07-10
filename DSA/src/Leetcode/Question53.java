package Leetcode;


import java.util.ArrayList;
import java.util.Arrays;

public class Question53 {
    public static void main(String[] args) {
        int[] nums = {1,-1,2,3};
//        int answer = maxSubArray(nums);
//        System.out.println(answer);
//        insertionSort(nums);
//        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> ans = maxSubArraySubQuestion(nums);
        System.out.println(ans);


    }
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i =0 ;i<nums.length;i++){
            int temp = i;
            while(temp!=nums.length){
                sum = sum + nums[temp];
                max=Math.max(max,sum);
                temp++;
            }
            sum = 0;
        }
        return max;
    }

    public static ArrayList<Integer> maxSubArraySubQuestion(int[]nums){
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
            max = Math.max(sum,max);
            list.add(nums[i]);
            if(sum<0){
                sum = 0;
            }
            if(sum<=0){
                list.clear();
            }
        }
        return list;
    }

    public static void insertionSort(int[]arr){
        for(int i =0 ;i<arr.length-1;i++){
            for(int j = i+1; j>0;j--){
                if(arr[j]>arr[j-1]){
                    swap(j,j-1,arr);
                }
            }
        }
    }

    public static void swap(int a ,int b,int[]arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
