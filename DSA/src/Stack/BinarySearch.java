package Stack;

// WAP TO IMPLEMENT ITERATIVE AND RECURSIVE BINARY SEARCH
// 3500ns - 5
// 3750ns - 10
// 4917ns - 15
// 5125ns -20

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
        BinarySearch obj = new BinarySearch();
        long start1 =  System.nanoTime();
        BinarySearch.recursiveBinary(12,arr,0,arr.length-1);
        long end1 = System.nanoTime();
        System.out.println(end1 - start1);
    }

    public static int binarySearch(int data, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] > data) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Integer.MIN_VALUE;
    }


    public static int recursiveBinary(int data, int[] arr, int start, int end) {
        int mid = (start + end) / 2;
        if(start>end){
            return Integer.MIN_VALUE;
        }
        else if(arr[mid] == data){
            return mid;
        }
        else if(arr[mid] > data){
            return recursiveBinary(data, arr, start, mid-1);
        }
        else if(arr[mid]<data) {
            return recursiveBinary(data, arr, mid+1, end);
        }

        return Integer.MIN_VALUE;
    }
}
