class Main2 {
 public static void main(String[] args) {
        doublyLinkedlist dll=new doublyLinkedlist();
        dll.createDLL(5);
        dll.insertionDLL(2,0);
        dll.insertionDLL(3,1);
        dll.insertionDLL(4,2);
        dll.traverseDLL();
        dll.reverseTraverse();
        dll.searchNode(4);
        dll.deleteNodeDLL(2);
        dll.traverseDLL();
        dll.deleteEntireDLL();
        dll.traverseDLL();

        System.out.println(dll.head.next.value);
    }
}
