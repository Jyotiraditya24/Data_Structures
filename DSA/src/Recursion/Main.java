package Recursion;

public class Main {
    public static void main(String[] args) {
//    message(1);
//        System.out.println(fibo(30));
        int[]arr = {10,20,30,40,50};
        System.out.println(binarySearch(0,arr.length-1,40,arr));
    }

    static void message(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        message(n+1);
        System.out.println(n);
    }

    static int fibo(int n){
        if( n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

    static int binarySearch(int start,int end,int target,int[]arr){
        if(start > end ){
            return -1;
        }
        int mid = start - (start- end)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearch(mid+1,end,target,arr);
        }
        else{
            return binarySearch(start, mid - 1,target,arr);
        }
    }


}
