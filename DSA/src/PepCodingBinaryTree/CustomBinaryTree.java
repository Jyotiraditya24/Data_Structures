package PepCodingBinaryTree;

public class CustomBinaryTree {







    private static class Node{
        Node left;
        Node right;
        int data;

        Node(int data){
            this.data = data;
        }
        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}

