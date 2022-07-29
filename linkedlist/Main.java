class Main{
 public static void main(String[] args) {
    Singlylinkedlist sLL= new Singlylinkedlist();
    sLL.createSinglyLinkedList(5);
    System.out.println(sLL.head.value);
    sLL.insertionList(6,0);
    sLL.insertionList(7,3);
    System.out.println(sLL.head.value);
    sLL.traversalMethod();
    sLL.searchingMethod(7);
    sLL.deleteNode(3);
    sLL.traversalMethod(); 
sLL.deleteEntire();
    sLL.traversalMethod();   
}

}