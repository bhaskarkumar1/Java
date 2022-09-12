class Gcd{
  public static void main(String[] args)  {
Gcd recursion= new Gcd();
var rec= recursion.gcd(48,-18);
System.out.println(rec);
  }
public int gcd(int a,int b){
  if (b==0) {
    return a;
  }
  if (a<0 || b<0) {
    return -1;
  }
  return gcd(b, a%b);
}

}
