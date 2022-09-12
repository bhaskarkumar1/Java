class fibonacci{
 public static void main(String[] args) {
 fibonacci recursion=new fibonacci();
 var rec= recursion.fib(-4);
 System.out.println(rec);
 }
public int fib(int n){
  if(n==0 ||n==1){
    return n;
  }
  if (n<0){
    return -1;
  }
return fib(n-1)+fib(n-2);


}

}
