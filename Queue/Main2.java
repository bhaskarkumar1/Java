class Main2{
    public static void main(String[] args){
        CircularQueue cq=new CircularQueue(5);
        boolean res=cq.isEmpty();
        System.out.println(res);
        System.out.println(cq.isFull());
        cq.enQueue(1);
        cq.enQueue(2);
        cq.enQueue(3);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(6);
        System.out.println(cq.deQueue());
        System.out.println(cq.peek());
        cq.delete();
    }
}