package PepCodingBinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
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
            root = node;
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

    public void PreDisplay() {
        PreDisplay(this.root);
    }

    private void PreDisplay(Node root) {
        if (root == null) {
            return;
        }
        System.out.println((root.left != null ? root.left.data : "null") + "<-" + root.data + "->" + (root.right != null ? root.right.data : "null"));
        PreDisplay(root.left);
        PreDisplay(root.right);
    }


    public int size(){
      return  size(this.root);
    }
    private int size(Node root){
        if(root == null){
            return 0;
        }
        int heightLeft = size(root.left);
        int heightRight = size(root.right);

        return  heightRight+heightLeft + 1;
    }

    public int height(){
       return height(this.root) -1;
    }

    private int height(Node root){
        if(root==null){
            return 0; // return -1 for edges, 0 for nodes
        }
        int heightLeft = height(root.left);
        int heightRight = height(root.right);

        return (Math.max(heightLeft,heightRight) +1);
    }

    public int sum(){
        return sum(this.root);
    }

    private int sum(Node root){
        if(root == null){
            return  0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum+ rightSum + root.data;
    }

    public int max(){
        return max(this.root);
    }

    private int max(Node root){
        if(root==null){
            return 0;
        }
        int leftData = max(root.left);
        int rightData = max(root.right);
        return Math.max(root.data,Math.max(leftData,rightData));
    }


    public void preOrderTraversal(){
        preOrderTraversal(this.root);
    }

    public void postOrderTraversal(){
        postOrderTraversal(this.root);
    }
    public void inOrderTraversal(){
        inOrderTraversal(this.root);
    }


    private void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    private void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+", ");
    }
    private void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+", ");
        inOrderTraversal(root.right);
    }

    public void levelOrderTraversal(){
        levelOrderTraversal(this.root);
    }

    private void levelOrderTraversal(Node root){
        System.out.println("LEVEL ORDER TRAVERSAL STARTED");
// used concept of remove print add
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size()>0){
            int size = queue.size();
            for (int i=0;i<size;i++){
                Node node = queue.peek();
                System.out.print(node.data+ " ");
                queue.remove();
                if(node.left!=null){
                queue.add(node.left);
                }
                if(node.right!=null){
                queue.add(node.right);
                }
            }
            System.out.println();
        }
        System.out.println("LEVEL ORDER TRAVERSAL ENDED");
    }

    public void iterativePreOrder(){
        iterativePreOrder(this.root);
    }

    private void iterativePreOrder(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        System.out.print("START ->");
        while (stack.size()>0){
            Node node = stack.pop();
            System.out.print(node.data+"->");
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        System.out.println("END");
    }

    public void iterativeAll(){
        iterativeAll(this.root);
    }
    private void iterativeAll(Node root){
        Stack<Pair> stack = new Stack<>();
        Pair pair = new Pair(root,1);
        stack.push(pair);
        String pre = "PREORDER ->";
        String in =  "INORDER ->";
        String post =  "POSTORDER ->";
        while (stack.size()>0){
            Pair top = stack.peek();
            int val = top.value;
            if(val==1){
//                System.out.print("PRE ->"+top.node.data+"->");
               pre+=top.node.data+"->";
                Node left = top.node.left;
                if(left!=null){
                    Pair topush = new Pair(top.node.left,1);
                    stack.push(topush);
                }
                top.value+=1;
            }
           else if(val == 2){
                in+=top.node.data+"->";
                Node right = top.node.right;
                if(right!=null){
                    Pair topush = new Pair(right,1);
                    stack.push(topush);
                }
                top.value+=1;
            }
            else {
                post+=top.node.data+"->";
                stack.pop();
            }
        }
        System.out.println(pre+"END");
        System.out.println(in+"END") ;
        System.out.println(post+"END");
    }

    private static ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> nodeToRootPath(int target){
        boolean ans =  nodeToRootPath(this.root,target);
        return list;

    }

    private boolean nodeToRootPath(Node root, int target ) {
        if(root==null){
            return false;
        }
        list.add(root.data);

        if (root.data == target) {
            return true;
        }
        boolean leftChild = nodeToRootPath(root.left,target);
        boolean rightChild = nodeToRootPath(root.right,target);
        if(leftChild || rightChild){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }

    public boolean find(int target){
        return find(this.root, target);
    }
    private boolean find(Node node,int target){
        if(node == null){
            return false;
        }
        if(node.data == target){
            return true;
        }
       boolean leftChild =  find(node.left , target);
        if(leftChild){
            return true;
        }

        boolean rightChild = find(node.right,target);
        if(rightChild){
            return true;
        }
     return false;

    }

    public void printKLevel(int level){
        printKLevel(this.root,level);
    }

    private void printKLevel(Node root, int level) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int heroNumber = 0;
        while (heroNumber!=level+1){
            int size = queue.size();
            for (int i =0;i<size;i++){
                Node top = queue.remove();
                if(heroNumber==level){
                    System.out.print(top.data+" ");
                }
                if(top.left!=null){
                    queue.add(top.left);
                }
                if(top.right!=null){
                    queue.add(top.right);
                }
            }
            heroNumber+=1;
        }
    }

    public void printKlevelRecursive(int level){
        printKlevelRecursive(this.root,level);
    }
    private void printKlevelRecursive(Node root,int level){
        if(root == null){
            return;
        }
        if(level == 0){
            System.out.print(root.left.data + " " );
            System.out.print(root.right.data + " ");
        }
        printKLevel(root.left,level-1);
        printKLevel(root.right,level-1);
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

