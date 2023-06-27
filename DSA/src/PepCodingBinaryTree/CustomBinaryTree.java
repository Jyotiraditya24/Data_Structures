package PepCodingBinaryTree;

import java.util.Stack;

public class CustomBinaryTree {
    private Stack<Pair> stack = new Stack<>();
    private Node root;

    CustomBinaryTree(){

    }

    public void createBinaryTree(Integer[]arr){
        if(this.root==null){
            Node node = new Node(arr[0]);
            Pair rp = new Pair(node,1);
            stack.push(rp);
        }
        int index = 0;
        while (stack.size()>0){
            Pair top = stack.peek();
            if(top.value == 1){
                index+=1;
                if(arr[index]!=null){
                    Node ln = new Node(arr[index]);
                    Pair lp = new Pair(ln,1);
                    stack.push(lp);
                    top.node.left = ln;
                }else {
                    top.node.left = null;
                }
                top.value += 1; //will increase the value to 1 if its null or we added a value
            }else if(top.value == 2){
                index+=1;
                if(arr[index]!=null){
                    Node node = new Node(arr[index]);
                    Pair pair = new Pair(node,1);
                    top.node.right = node;
                    stack.push(pair);
                }else {
                    top.node.right = null;
                }
                top.value +=1;
            }else {
                stack.pop();
            }
        }
    }






    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private static class Pair {
        Node node;
        int value;

        Pair(Node node,int value){
            this.node = node;
            this.value = value;
        }
    }
}

