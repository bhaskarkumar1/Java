import java.util.Arrays;
class Middlefunction{
  public static void main(String[] args){
    Middlefunction ab= new Middlefunction();
    int[] arr= {1,2,3,4,5,6,7};
    int[] result=ab.middle(arr);
    System.out.println(Arrays.toString(result));
  }
 public int[] middle(int[] arr){
   return Arrays.copyOfRange(arr, 1, arr.length-1);
 }


}
