class Main{
    public static void main(String[] args){
        QueueArray qa=new QueueArray(5);
        // boolean result1=qa.isFull();
        // System.out.println("isFull: "+result1);
        // boolean result2=qa.isEmpty();
        // System.out.println("isEmpty: "+result2);
        qa.enQueue(1);
        qa.enQueue(2);
        qa.enQueue(3);
        qa.enQueue(4);
        qa.enQueue(5);
        // qa.enQueue(6);
        // qa.enQueue(7);
        int result3= qa.deQueue();
        System.out.println(result3);
        int result4=qa.peek();
        System.out.println(result4);
        qa.delete();

    }
} 