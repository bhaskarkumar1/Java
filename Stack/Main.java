class Main{

    public static void main(String[] args) {
    stackArray newstack=new stackArray(4);
    boolean result=newstack.isEmpty();
    System.out.println(result);
    boolean result1=newstack.isFull();
    System.out.println(result1);
    newstack.push(4);
    newstack.push(3);
    newstack.push(42);
    newstack.push(31);
    newstack.push(31);
        int result3=newstack.pop();
        System.out.println(result3);
        int result4=newstack.peek();
        System.out.println(result4);
        newstack.delete();
    }

}

