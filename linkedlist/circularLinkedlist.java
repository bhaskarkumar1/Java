public class circularLinkedlist{
  public Node head;
  public Node tail;
  public int size;


  public Node createCSLL(int nodeValue){
    head =new Node();
    Node node= new Node();
    node.value=nodeValue;
    node.next=node;
    head=node;
    tail=node;
    size=1;
    return head;
  }

  public void insertCSLL(int nodeValue,int location){
    // create new node
    Node node=new Node();
    //assign value to created node
    node.value=nodeValue;
    //check CSLL exist or not
    if(head==null){
        //create csll
        createCSLL(nodeValue);
        return;
    }else if(location==0){
      node.next=head;//refrnc from head
      head=node; //point to the first node
      tail.next=head;// tail refrnc point to the head
    }else if(location>=size){
      tail.next=node;
      tail=node;
      tail.next=head;
    }else{
      Node tempNode=head;
      int index=0;
      while(index<location-1){
        tempNode=tempNode.next;
        index++;
      }
      node.next=tempNode.next;
      tempNode.next=node;
     }
     size++;
    }

    //traverse method
    public void traverseCSLL(){
      if(head!=null){
        Node tempNode=head;
        for(int i=0; i< size; i++){
          System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print("->");
        }
        tempNode=tempNode.next;
        }
        System.out.println("\n ");   

      }else{
       System.out.println("\n CSLL does not exist!")  ; 
      }
    }
    //Searching method
     public boolean searchCSLL(int nodeValue){
      if(head==null) {
        System.out.println("CSLL not found");

      }else{
        Node tempNode=head;
        for(int i=0; i< size; i++){
          if(tempNode.value==nodeValue){
            System.out.println("Node found at location "+i+"\n");
            return true;

          } 
          tempNode=tempNode.next;
        }
        
      }
        
      System.out.println("Node not found");
      return false;
      }

      //delete method
      public void deleteNode(int location){
        if(head==null){
          System.out.println("CSLL does not exist!");
          return;
        }else if(location ==0){
           head=head.next;
           tail.next=head;
           size--;
           if(size==0){
            tail=null;
            head.next=null;
            head=null;
           }
        }else if(location>=size){
          Node tempNode=head;
          for(int i=0;i<size-1;i++){
            tempNode=tempNode.next;
          }
          if(tempNode==head){
            head.next=null;
            tail= head = null;
            size--;

            return;
          }
          tempNode.next=head;
          tail=tempNode;
          size--;
        }else{
          Node tempNode= head;
          for(int i=0;i<location-1;i++){
            tempNode=tempNode.next;
          }
          tempNode.next=tempNode.next.next;
          size--;
        }
      }
      //Delete entire CSLL
      public void deleteCSLL(){
        if(head==null){
          System.out.println("CSLL not exist!");
        }else{
          head=null;
          tail.next=null;
          tail=null;
          System.out.println("CSLL deleted successfully");
        }
      }



}