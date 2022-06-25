class Decimalbinary{
public static void main(String[] args) {
 Decimalbinary recursion= new Decimalbinary();
 var rec =recursion.decimal2binary(10);
 System.out.println(rec);
}
  public int decimal2binary(int n){
    if (n==0) {
      return 0;

    }
    if (n<0) {
      return -1;
    }
    return 10*decimal2binary(n/2)+ n%2;
  }
}
