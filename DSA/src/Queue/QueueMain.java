package Queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(10);
        queue.insert(20);
        queue.remove();
       queue.display();
    }
}
