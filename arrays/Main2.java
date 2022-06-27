import java.util.Arrays;
class Main2{
  public static void main (String[] args){
    // declare
    int[][] int2darray; //O1
    //instantiate
    int2darray=new int[2][2]; //O1
    // intialization
    int2darray[0][0]=1;
    int2darray[0][1]=2;
    int2darray[0][1]=3; //all together O(MN)
    int2darray[1][1]=4;
    System.out.println(Arrays.deepToString(int2darray));


    // all Together
    String s2dArray[][]={{"A","B"},{"C","D"}}; //O1
    System.out.println(Arrays.deepToString(s2dArray));
 // but space complexity is Omn

 System.out.println("    /// Insert  method");
TwodimensionalArrays sda =new TwodimensionalArrays(2,2);
sda.insertValueInTheArray(0 , 0, 10);
System.out.println(Arrays.deepToString(sda.arr));

  }


}
