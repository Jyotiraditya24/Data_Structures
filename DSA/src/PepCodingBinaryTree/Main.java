package PepCodingBinaryTree;

public class Main {
    public static void main(String[] args) {
        Integer[]arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.createBinaryTree(arr);
        tree.PreDisplay();
        System.out.println(tree.size());
        System.out.println(tree.height());
        System.out.println(tree.sum());
        System.out.println(tree.max());
        tree.preOrderTraversal();
        System.out.println();
        tree.inOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();
        System.out.println();
        tree.levelOrderTraversal();
        tree.iterativePreOrder();
        tree.iterativeAll();
    }
}
