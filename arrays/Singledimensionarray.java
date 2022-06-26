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


// array search
public void searchArray(int valuetoSearch){
  for(int i=0; i<arr.length; i++){ //ON
    if(arr[i]==valuetoSearch){ //O1
      System.out.println("value found at index "+ i); //O1
      return; //O1
    }



  }
  System.out.println("value not found"); //O1

}


// Delete in array
 public void deleteValue(int location){

   try{
     arr[location]=Integer.MIN_VALUE; //O1
     System.out.println("value Successfully deleted");
   }catch(ArrayIndexOutOfBoundsException e){
   System.out.println("index not found");
 }

}

}
