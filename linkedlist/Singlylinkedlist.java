public class Singlylinkedlist{
    public Node head;
    public Node tail;
    public int size;

    //method for single linkedlist
    public Node createSinglyLinkedList(int nodeValue){
        head=new Node();  //new instance of head of Node
        Node node= new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;

        return head;
    }

    //Insertion method
    public void insertionList(int nodeValue, int location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSinglyLinkedList(nodeValue);
            return ;
        
        }else if(location==0){
            node.next=head;
            head=node;
        }else if(location>=size){
            node.next=null;
            tail.next=node;
            tail=node;
        }else{
            Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;
        }
        size++;
    }
    //traversal
    public void traversalMethod(){
        Node tempNode=head;
        for(int i=0; i<size; i++){
            System.out.print(tempNode.value);
            tempNode=tempNode.next;
            if(i!=size-1){
                System.out.print("->");
            }
        }

    }
    //Searching Method
     boolean searchingMethod(int nodeValue){
        if(head!=null){

            Node tempNode= head;
            for(int j =0;j<size;j++){
                if(tempNode.value==nodeValue){
                    System.out.println("Node found at" +j+"\n");
    
                    return true;
                }
                tempNode=tempNode.next;
            }
           
        }
    

        System.out.println("Node not found");
        return false;

    }
// deleting a node from SinglyLinkedlist
public void deleteNode(int location){
    if (head==null){
        System.out.println("SLL does not exits");
        return;
    }else if (location==0){
        head=head.next;
        size--;
        if(size==0){
            tail=null;
        }
    }
            else if(location>=size)  {
                Node tempNode=head;
                for(int k=0;k<size-1;k++){
                    tempNode=tempNode.next;
                }
                if(tempNode==head){
                    head=tail=null;
                    size--;
                }
                tempNode.next=null;
                tail=tempNode;
                size--;

           }else{
            Node tempNode=head;
            for(int i=0; i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
           }
    
}
// delete entire SLL
public void deleteEntire(){
    head=null;
    tail=null;
    System.out.println("sll Deleted Successfully");
}




}