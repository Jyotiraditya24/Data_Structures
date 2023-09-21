package Stack;

import java.util.Arrays;

public class BBSort {
    public static void main(String[] args) {
        int[]arr = {100,4,-2,-6};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
        BBSort obj = new BBSort();


        long start3 =  System.nanoTime();
        BBSort.bubbleSort(arr);
        long end3 = System.nanoTime();
        System.out.println("Bubble Sort " + (end3-start3));
        System.out.println(Arrays.toString(arr));

//        long start1 =  System.nanoTime();
//        BBSort.selectionSort(arr);
//        long end1 = System.nanoTime();
//        System.out.println("Selection Sort " + (end1-start1));


//        long start2 =  System.nanoTime();
//        BBSort.insertionSort(arr);
//        long end2 = System.nanoTime();
//        System.out.println("Insertion Sort " + (end2-start2));
//        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[]arr){
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[]arr){
        for(int i=1;i<arr.length;i++){
            int j = i;
            while(j>=1){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
               j--;
            }
        }
    }
    public static void selectionSort(int[]arr){
        int correctIndex = arr.length-1;
        for(int i=0;i<arr.length;i++){
            int max = arr[i];
            int maxIndex = i;
            for(int j =0 ;j<arr.length-i;j++){
                if(max<arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            int temp = arr[correctIndex];
            arr[correctIndex] = arr[maxIndex];
            arr[maxIndex] = temp;
            correctIndex--;
        }
    }


}
