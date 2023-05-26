package Stack;

public class CustomStack {
    protected int[]data;
    private static final int DEFAULT_SIZE = 10;
    private int pointer = -1;

    public CustomStack(){
       this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int num){
        if(isFull()){
            System.out.println("cannot push");
            return false;
        }
        else {
            pointer+= 1;
            data[pointer] = num;
            return true;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("cannot pop");
            return Integer.MIN_VALUE ;
        }
        else {
            int removed = data[pointer];
            pointer--;
            return removed;
        }
    }

    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return data[pointer];
    }

    private boolean isFull() {
        return data.length -1 == pointer;
    }
    private boolean isEmpty(){
        return pointer == -1;
    }
}
