package BinaryTrees;

import java.util.Scanner;

public class BinaryTree {
    private Node root;
    public BinaryTree(){

    }

    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    //INSERT ELEMENTS
    public void populate (Scanner scanner){
        System.out.println("Enter the root again");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter the left of"+node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the left value of"+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to enter the right of"+node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right value of"+node.value);
            int value = scanner.nextInt();
           node.right =  new Node(value);
           populate(scanner,node.right);
        }

    }
    // DISPLAY
    public void display(){
        display(root,"");
    }

    private void display(Node node, String tree){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        display(node.left,tree + "->" + node.value);
        display(node.right,tree+"->"+node.value);
    }

}
