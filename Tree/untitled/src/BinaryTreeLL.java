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

}
