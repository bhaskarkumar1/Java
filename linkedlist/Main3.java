class Main3{
    public static void main(String[] args){
        circularDoublylinkedlist cdll=new circularDoublylinkedlist();
        cdll.createCDLL(1);
        System.out.println(cdll.head.value);
        cdll.insertNode(2,1);
        cdll.insertNode(3,3);
        cdll.traverseMethod();
        cdll.reverseTraverse();

        System.out.println(cdll.head.next.value);





    }



}