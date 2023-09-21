package PepCodingBinaryTree.BST;


public class Main {
    public static void main(String[] args) {

    }

    private class Node {
        int data;
        Node left;
        Node right;

        Node(){

        }
        Node(int data , Node left , Node right ){
            this.data = data;
            this.left = left;
            this.right = right;
        }
        Node(int data){
            this.data = data;
        }
    }
}



