class Power{
public static void main(String[] args){

Power recursion= new Power();
var rec= recursion.power(2,5);
System.out.println(rec);


}
public int power(int base,int exp){
if (exp==0) {
  return 1;
}

 if(exp<0){
   return -1;
 }
return base*power(base, exp-1);
}

}
