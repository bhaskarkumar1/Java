public class Singledimensionarray{

 int arr[]=null;
 public Singledimensionarray(int sizeoOfArray){
   arr=new int[sizeoOfArray];
   for (int i=0;i<arr.length ; i++) {
     arr[i]=Integer.MIN_VALUE;
   }

 }
public void insert(int location, int valueToBeInserted){

try{
  if (arr[location]==Integer.MIN_VALUE){
  arr[location]= valueToBeInserted;
  System.out.println("successfully inserted");
}else{
  System.out.println("this cell is already occupied");
}

}catch(ArrayIndexOutOfBoundsException e){
  System.out.println("Invalid Index to access arrays");
}


}
//Array Traversal
public void traversalArray(){
  try{
    for (int i=0;i<arr.length ;i++ ) {  // ON
      System.out.print(arr[i]+"  "); //O1
    }
  }catch(Exception e){
    System.out.println("Array no longer exist"); //O1
  }


}



}
