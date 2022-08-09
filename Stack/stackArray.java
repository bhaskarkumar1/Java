public class stackArray{
    int[] arr;
    int topOfstack;

    public stackArray(int size){
        this.arr =new int[size];
        this.topOfstack=-1;
        System.out.println("THe stack is created wiith the size: " + size);
    }

    //is Empty
    public boolean isEmpty(){
        return (topOfstack==-1) ? true:false;
    }
    public  boolean isFull(){
        if(topOfstack==arr.length-1){
            System.out.println("the stack is full");
            return true;
        }else{
            return false;
        }
    }

    //push
    public void push(int value){
        if (isFull()){
            System.out.println("the Stack is full");
        }else{
            arr[topOfstack+1]=value;
            topOfstack++;
            System.out.println("the value is Successfully inserted");

        }
    }
    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;

        }else{
            int topstack=arr[topOfstack];
            topOfstack--;
            return topstack;
        }
    }

    //peek method
public int peek(){
    if (isEmpty()){
        System.out.println("stack is empty");
        return-1;
    }else{
        int topstack=arr[topOfstack];
        return topstack;
    }
}
// delete 
public void delete(){
    arr= null;
    System.out.println("Deleted Successfully");
}

}