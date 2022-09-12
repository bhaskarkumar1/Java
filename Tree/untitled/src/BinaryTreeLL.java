import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;
    public BinaryTreeLL(){
        this.root=null;
    }
    //preorder traversal
    void preOder(BinaryNode node){
        if(node==null) return ;
        System.out.print(node.value+ " ");
        preOder(node.left);
        preOder(node.right);
    }
    //inOrder traversal
    void inOrder(BinaryNode node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }
    //postOrder traversal
    void postOrder(BinaryNode node){
        if(node== null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");

    }
    //levelOrder
    void levelOrder(){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            System.out.print(presentNode.value +" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }
    //Search method
    public void search(String value){
        Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode=queue.remove();
            if(presentNode.value==value){
                System.out.println("the value "+value+"is found in tree");
                return;
            }else{
                if(presentNode.left!=null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right!=null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("the value is not found");
    }




}
