public class CircularQueue{
    int arr[];
    int topOfQueue;
    int beginingOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr=new int[size];
        this.size=size;
        this.beginingOfQueue=-1;
        this.topOfQueue=-1;
        System.out.println("the CQ is created successfully of size :" +size);
    }

    //empty?

    public boolean isEmpty(){
        if(topOfQueue==-1) return true;
        return false;
    }

    //isFull
    public boolean isFull(){
        if(topOfQueue+1==beginingOfQueue) return true;
        else if(beginingOfQueue==0 && topOfQueue+1==size) return true;
        return false;
    }
//enqueue
public void enQueue(int value){
    if(isFull()){
        System.out.println("CQ is full!!");

    }else if(isEmpty()){
        beginingOfQueue=0;
        topOfQueue++;
        arr[topOfQueue]=value;
        System.out.println("the value is inserted Successfully: "+value);
    }else{
        if(topOfQueue+1==size){
            topOfQueue=0;
        }else{
            topOfQueue++;
        }
        arr[topOfQueue]=value;
        System.out.println("Successfully inserted value: "+value);
    }
}
//deQueue
public int deQueue(){
    if(isEmpty()){
        System.out.println("the cq is empty");
        return -1;
    }else{
        int result=arr[beginingOfQueue];
        arr[beginingOfQueue]=0;
        if(beginingOfQueue==topOfQueue){
            beginingOfQueue=topOfQueue=-1;
        }else if(beginingOfQueue+1==size){
            beginingOfQueue=0;
        }else{
            beginingOfQueue++;
        }
        return result;
    }
}

// peek
public int peek(){
    if(isEmpty()){
        System.out.println("CQ is Empty!");
        return -1;
    }
    return arr[0];
}
//delete 
public void delete(){
    arr=null;
    System.out.println("Successfully deleted");
}

}