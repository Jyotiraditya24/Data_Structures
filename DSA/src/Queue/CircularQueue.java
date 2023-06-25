//package Queue;
//
//public class CircularQueue extends CustomQueue{
//    int front = 0;
//   private int size =0;
//
//    public CircularQueue(){
//        super();
//    }
//    public CircularQueue(int num){
//        super(num);
//    }
//    public boolean insert(int num){
//        if(isFull()){
//            System.out.println("Cannot");
//            return false;
//        }else {
//            super.arr[super.end] = num;
//            end = (end)%super.arr.length;
//            size++;
//            return true;
//        }
//    }
//
//    public boolean remove(){
//        if(isEmpty()){
//            return false;
//        }
//
//    }
//
//    public boolean isEmpty(){
//        return end==0;
//    }
//
//    public boolean isFull(){
//        return arr.length == size;
//    }
//
//}