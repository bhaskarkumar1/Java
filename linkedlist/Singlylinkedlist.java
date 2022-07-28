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
}