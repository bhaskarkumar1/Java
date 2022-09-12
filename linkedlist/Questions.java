import java.util.HashSet;

public class Questions{
    void deleteDups(Qlinkedlist ll){
        HashSet<Integer> hs=new HashSet();
        Qnode current=ll.head;
        Qnode prev= null;{
            while(current!=null){
                int curval=current.value;
                if(hs.contains(curval)){
                    prev.next=current.next;
                    ll.size--;
                }else{
                    hs.add(curval);
                    prev=current;
                }
                current=current.next;
            }
        }
    }


}