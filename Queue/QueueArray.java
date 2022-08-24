public class QueueArray{
int[] arr;
int beginingOfQueue;
int topOfQueue;

//create Queue
public QueueArray(int size){
    this.arr=new int[size];
    this.topOfQueue=-1;
    this.beginingOfQueue=-1;
    System.out.println("the Queue is successfully created of size: " + size);
}
//isFull method
public boolean isFull(){
    if(topOfQueue==arr.length-1) return true;
   return false;
}
//isEmpty
public boolean isEmpty(){
    if(beginingOfQueue==-1||beginingOfQueue==arr.length) return true;
    return false;
}
// enQueue
public void enQueue(int value){
    if(isFull()){
        System.out.println("Queue is already full");
    }else if(isEmpty()){
        beginingOfQueue=0;
        topOfQueue++;
        arr[topOfQueue]=value;
        System.out.println("the value is successfully inserted in queue");
    }else{
        topOfQueue++;
        arr[topOfQueue]=value;
        System.out.println("the value is successfully inserted in queue");

    }
}
//deQueue
public int deQueue(){
    if(isEmpty()){
        System.out.println("the Queue is empty");
        return -1;
    }else{
        int result=arr[beginingOfQueue];
        beginingOfQueue++;
        if(beginingOfQueue>topOfQueue){
            beginingOfQueue=topOfQueue;
        }
        return result;
    }

}

//peek method
public int peek(){
    if(!isEmpty()){
        return arr[beginingOfQueue];
    }else{
        System.out.println("The queue is empty");
        return -1;
    }
}
// delete 
public void delete(){
    arr=null;
    System.out.println("Successfully deleted");
}
}