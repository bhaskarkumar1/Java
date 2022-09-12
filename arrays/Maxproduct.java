import java.util.Arrays;
class Maxproduct{
  public static void main(String[] args){
    Maxproduct ab= new Maxproduct();
    int[] intArray={10,20,30,40,50};
    String result=ab.maxproduct(intArray);
    System.out.println(result);

  }
  public String maxproduct(int[] intArray){
    int max=0;
    String pairs="";
    for (int i=0;i< intArray.length ;i++ ) {
          for (int j=i+1;j<intArray.length ;j++ ) {
            if(intArray[i]*intArray[j]>max){
              max=intArray[i]*intArray[j];
              pairs=Integer.toString(intArray[i])+","+Integer.toString(intArray[j]);
            }

          }

    }
  return pairs;

  }

}
