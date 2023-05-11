package Recursion;

import java.util.ArrayList;

public class Video3Arrays {
    public static void main(String[] args) {
        int[] arr = {-10,0,10,20};
        System.out.println(sorted(arr,0));
        System.out.println(linear(arr,0,-100));
    }

    public static boolean sorted(int[] arr, int pointer) {
        if (pointer == arr.length - 1) {
            return true;
        }
        return arr[pointer] <= arr[pointer + 1] && sorted(arr, pointer + 1);
    }

    public static boolean linear(int[]arr,int pointer,int target){
        if(pointer == arr.length){
            return false;
        }else if(arr[pointer] == target)return true;
        return arr[pointer]!=target && linear(arr,pointer+1,target);
    }
    public static ArrayList<Integer> findAllIndex(int[]arr,int pointer,int target){
        
    }
}
