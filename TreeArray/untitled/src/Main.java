public class Main {
    public static void main(String[] args) {
        BinaryTree newBinaryTree =new BinaryTree(9);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");
        newBinaryTree.insert("N7");
        newBinaryTree.insert("N8");
        newBinaryTree.insert("N9");
        newBinaryTree.preOrder(1);
        System.out.println();
        newBinaryTree.inOrder(1);
        System.out.println();
        newBinaryTree.postOrder(1);
        System.out.println();
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.search("N10");
        System.out.println();
        newBinaryTree.delete("N3");
        System.out.println();
        newBinaryTree.levelOrder();
        System.out.println();
        newBinaryTree.deleteAll();
    }

}