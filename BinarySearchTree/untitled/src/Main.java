public class Main {
    public static void main(String[] args) {

        BinarySearchTree newBST=new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.preOrder(newBST.root);
        System.out.println();
        newBST.inOrder(newBST.root);
        System.out.println();
        newBST.postOrder(newBST.root);
        System.out.println();
        System.out.println("Level order");
        newBST.levelOrder();

        System.out.println();
        System.out.println("Search");
        newBST.search(newBST.root, 45);
        System.out.println();
        newBST.deleteNode(newBST.root,40);
        newBST.deleteAll();
        newBST.levelOrder();
           }
}




