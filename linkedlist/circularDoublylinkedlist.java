public class circularDoublylinkedlist{
public doublyNode head;
public doublyNode tail;
public int size;


//create CDLL
public doublyNode createCDLL(int nodeValue){
    doublyNode node= new doublyNode();
    node.value=nodeValue;
    head=node;
    tail=node;
    node.next=node;
    node.prev=node;
    size=1;
    return head;
}
public void insertNode(int nodeValue, int location){
    doublyNode node=new doublyNode();
    node.value=nodeValue;
    if(head==null){
        // System.out.println("CDLL not found!");
        createCDLL(nodeValue);
        return;
    }else if(location==0){
        node.prev=tail;
        node.next=head;
        head.prev=node;
        head=node;
        tail.next=node;
    }else if(location>=size){
        node.prev=tail;
        node.next=head;
        head.prev=node;
        tail.next=node;
        tail=node;

    }else{
        doublyNode tempNode=head;
        int index=0;
        while(index<location-1){
            tempNode=tempNode.next;
            index++;

        }
        node.prev=tempNode;
        node.next=tempNode.next;
        tempNode.next=node;
        node.next.prev=node;
        size++;
    }
}

//traverse method
  void traverseMethod(){
    if(head!=null){

        doublyNode tempNode= head;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("->");
            }
    
    
            tempNode=tempNode.next;
        }

    }else{
        System.out.println("CDLL not exist");
    }

}
//  reverse traverse
public void reverseTraverse(){
    if(head!=null){

        doublyNode tempNode= tail;
        for(int i=0;i<size;i++){
            System.out.print(tempNode.value);
            if(i!=size-1){
                System.out.print("<-");
            }
    
    
            tempNode=tempNode.prev;
        }

    }else{
        System.out.println("CDLL not exist");
    }
}


} 