

import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    //Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("the value is successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }

    }

    void insert(int value) {
        root = insert(root, value);
    }

    //preOrder
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inOrder
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

    //postOrder
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");

    }

    // level Order
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    //search
    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value Not found!");
            return null;
        } else if (node.value == value) {
            System.out.println("Value  found!");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }
    //minimum node
    public static BinaryNode minimumNode(BinaryNode root){
        if(root.left==null) return root;
        else return minimumNode(root.left);
    }
//delete node
    public BinaryNode deleteNode(BinaryNode root, int value){
        if(root==null){
            System.out.println("Value not found!");
            return null;
        }
        if(value< root.value){
            root.left=deleteNode(root.left,value);
        }else if(value> root.value){
            root.right=deleteNode(root.right,value);
        }else{
            if(root.left!= null && root.right!=null){
                BinaryNode temp= root;
                BinaryNode minNodeRight=minimumNode(temp.right);
                root.value=minNodeRight.value;
                root.right=deleteNode(root.right,minNodeRight.value);
            } else if (root.left!=null) {
                root=root.left;
            }else if(root.right!=null){
                root=root.right;
            }else{
                root=null;
            }
        }
        return root;
    }
//deleteAll BST
    void deleteAll(){
        root=null;
        System.out.println("BST has been deleted Successfully");
    }

}