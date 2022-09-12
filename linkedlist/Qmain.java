class Qmain{

 public static void main(String[] args) {
    Qlinkedlist ll=new Qlinkedlist();
    ll.createLL(1);
    ll.insertMethod(2);
    ll.insertMethod(3);
    ll.insertMethod(4);
    ll.insertMethod(2);
    ll.insertMethod(2);
    ll.traverseMethod();
    Questions q=new Questions();
    q.deleteDups(ll);
    ll.traverseMethod();
}



}