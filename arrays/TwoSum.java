import java.util.Arrays;
class TwoSum{
 public static void main(String[] args){
  int num[]={1,2,3,4,5,6};
  TwoSum mn= new TwoSum();
int[] result= mn.twosum(num,7);
System.out.println(Arrays.toString(result));
}

public int[] twosum( int[] num, int target){
  for (int i=0;i<num.length ;i++ ) {
    for (int j=i+1;j<num.length ;j++ ) {
      if(num[i]+num[j]==target){
        return new int[] { i, j};
      }
    }

  }
  throw new IllegalArgumentException("No Solution found");
}
}
