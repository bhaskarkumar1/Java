public class Qlinkedlist{
Qnode head;
Qnode tail;
public int size;

public void createLL(int nodeValue){
    Qnode node=new Qnode();
    node.value=nodeValue;
    node.next=null;
    head=node;
    tail=node;
    size=1;
    
}

public void insertMethod(int nodeValue){
Qnode node= new Qnode();
node.value=nodeValue;
node.next=null;
tail.next= node;
tail=node;
size++;
}



public void traverseMethod(){
    Qnode tempNode=head;
    for(int i=0;i<size; i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
            System.out.print("->");

        }
        tempNode=tempNode.next;

    }
    System.out.println("\n");
}




}