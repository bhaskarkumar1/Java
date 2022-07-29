import java.lang.invoke.CallSite;

public class Main1 {

    public static void main(String[] args){

    circularLinkedlist csll=new circularLinkedlist();
    csll.createCSLL(5);
    csll.insertCSLL(4, 0);
    csll.insertCSLL(8, 1);
    csll.insertCSLL(9, 9);
        csll.traverseCSLL();
        csll.searchCSLL(10);
        csll.deleteNode(9);
        csll.traverseCSLL();
csll.deleteCSLL();
csll.traverseCSLL();

    System.out.println(csll.head.value);
    System.out.println(csll.head.next.value);
    }



}
