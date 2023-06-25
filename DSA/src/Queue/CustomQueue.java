package Queue;

public class CustomQueue {
    protected int[]arr;
    private static final int DEFAULT_SIZE = 10;
    int end= 0;


    CustomQueue(){
        this.arr = new int[DEFAULT_SIZE];
    }

    CustomQueue(int size){
        this.arr = new int[size];
    }

    public boolean isFull() {
        return arr.length-1 == end;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int num){
        if(isFull()){
            return false;
        }
        arr[end++] = num;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int removed = arr[0];
        for(int i = 0 ;i<arr.length-1;i++){
            arr[i+1] = arr[i];
        }
        end--;
        return removed;
    }
    public int front(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return arr[0];
    }
    public void display(){
        for(int i =0; i<end;i++){
            System.out.print(arr[i]+"->");
        }
        System.out.print("END");
    }
}

