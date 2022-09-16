public class BinaryTree {
    String[] arr;
    int lastUsedindex;
    int size;
    public BinaryTree(int size){
        arr= new String[size+1];
        lastUsedindex=0;
        System.out.println("blank tree created of size: "+size);
    }
// isFull
    boolean isFull(){
        if(arr.length-1==lastUsedindex) return true;
        else return false;
    }

    //insert method
    void insert(String value){
    if(!isFull()){
        arr[lastUsedindex+1]=value;
        lastUsedindex++;
        System.out.println("Successfully Inserted :"+value);
    }else{
        System.out.println("Binary tree is full");
    }
    }

    // preOrder
    public void preOrder(int index){
        if(index>lastUsedindex){
            return;
        }
        System.out.print(arr[index]+" ");
        preOrder(index*2);
        preOrder(index* 2+1);
    }

//inOrder
    public void inOrder(int index){
        if(index>lastUsedindex) return;
        inOrder(index*2);
        System.out.print(arr[index]+ " ");
        inOrder(index *2+1);
    }
//    PostOrder
public void postOrder(int index){
    if(index>lastUsedindex) return;
    postOrder(index*2);
    postOrder(index *2+1);
    System.out.print(arr[index]+ " ");
    }
//levelOrder
    public void levelOrder(){
        for(int i=1; i<=lastUsedindex;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Search
    public int search(String value){
        for(int i=1; i<=lastUsedindex;i++){
            if(arr[i]==value){
                System.out.println("exit at index of : "+ i );
                return i;

            }
        }
        System.out.println("value not exit!!!! ");
        return -1;
    }

    //delete method
public void delete(String value){
        int location=search(value);
        if(location==-1) return;
        else{
            arr[location]=arr[lastUsedindex];
            lastUsedindex--;
            System.out.println("The node is Successfully deleted ");
        }
}
//delete BTarray
   public void deleteAll(){
        try{
            arr=null;
            System.out.println("The BT is Successfully deleted ");

        }catch (Exception e){
            System.out.println("Error in deleting BT ");

        }
    }

}
