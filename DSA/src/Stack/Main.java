package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        Queue<Integer> queue = new LinkedList<>();
//        Deque<Integer> deque = new ArrayDeque<>();
// deque double ended queue we can add and remove from both side
// useful in priniting trees from left to right or vice versa
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());


    }
}
