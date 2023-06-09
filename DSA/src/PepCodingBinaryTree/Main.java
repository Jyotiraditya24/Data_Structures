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
        System.out.println(tree.nodeToRootPath(300));
        tree.printKLevel(3);
        System.out.println("HELLO");
        tree.printKLevelRecursive(2);
        System.out.println("\nTHE LEVEL IS");
        System.out.println(tree.whichLevel(87));
        System.out.println("**************************\n");
        tree.KLevelFar(37,2);
        System.out.println("\n");
        tree.printLeafToRoot();
        System.out.println("LOW TO HIGH PATHS");
        tree.lowAndHighLeafToRoot(100,150);
        System.out.println("ALTERNATIVE");
        tree.lowAndHighAlternative(100,150);
//        tree.leftClonedTree();  // comment this when using other methods because it modifies the original tree
        System.out.println("\n\n");
        tree.parentWithOneChild();

        System.out.println("After removal of leaf");
//        tree.removeLeaf();
        System.out.println("HEELLOOO"
        );
//        tree.experiment();
    }
}
