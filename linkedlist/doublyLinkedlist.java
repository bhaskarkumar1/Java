public class doublyLinkedlist {
   doublyNode head;
   doublyNode tail;
   int size;

    public doublyNode createDLL(int nodeValue){
        head=new doublyNode();
        doublyNode node=new doublyNode();
        node.value=nodeValue;
        node.next=null;
        node.prev= null;
        head=node;
        tail=node;
        size=1;
        return head;

    }
//insertion method
    public void insertionDLL(int nodeValue, int location){
        doublyNode node=new doublyNode();
        node.value=nodeValue;
        if(head==null){
            createDLL(nodeValue);
            return;
        }else if(location==0){
            node.next=head; 
            node.prev=null;
            head.prev=node;
            head=node;
        }else if(location>=size){
            node.next=null;
            tail.next=node;
            node.prev=tail;
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
        }
        size++;

    }
// traverse method
    public void traverseDLL(){
        if(head==null){
            System.out.println("DLL not exist!");
        }
        else{
            doublyNode tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
        }

        System.out.println("\n");
    }
//reverse traverse
    public void reverseTraverse(){
        if(head!=null){
            doublyNode tempNode=tail;
            for(int i=0; i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("<-");
                }
                tempNode=tempNode.prev;
            }
        } else{
            System.out.println("DLL not exist!");
        }

        System.out.println("\n");

    }








}
