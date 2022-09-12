class Sumofdigits{
 public static void main(String[] args){
Sumofdigits recursion= new Sumofdigits();
var rec= recursion.sum(-123456);
System.out.println(rec);


 }
public int sum(int n){
if(n==0){
  return 0;
}
if (n<0) {
  return -1;
}

return sum(n/10)+n%10;



}




}
