public class TwodimensionalArrays{
   int arr[][]=null;
   //constructor
   public TwodimensionalArrays(int numberOfRows, int numberOfColumns){
     this.arr=new int[numberOfRows][numberOfColumns];
     for (int row=0;row<arr.length ;row++ ) {
        for (int col=0;col<arr[0].length ;col++ ) {
          arr[row][row]=Integer.MIN_VALUE;
        }
     }

   }
// Inserting value in the TwodimensionalArrays  // O1
public void insertValueInTheArray(int row , int col, int value){
try{
  if(arr[row][col]==Integer.MIN_VALUE){  //O1
    arr[row][col]=value; // O1
  }
}catch(ArrayIndexOutOfBoundsException e){
  System.out.println("Invalid Array index");
}
}

public void accessCell(int row, int col){
   try{
     System.out.println("cell value is : "+ arr[row][col]);
   }catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Invalid Index for 2D array");
   }
}

// Traverse 2D  Array

public  void  traverseArray(){
for(int row=0; row<arr.length; row++){
	for(int col=0; col<arr[0].length; col++){
		System.out.println(arr[row][col] + " ");
}
System.out.println();
}
}


// Searching  ie linear search

public void searchingValue(int value){
for(int row=0; row<arr.length; row++){
	for (int col=0; col<arr[0].length;col++){
		if(arr[row][col]==value){
			System.out.println("Value is found at row: "+row+"# column:"+col);
			return;
}
}

}
System.out.println("value is not found");

}

// deleting value from array
 public void deleteValueFromArray(int row, int col){
try{
 System.out.println("Successfully deleted" + arr[row][col]);
 arr[row][col]= Integer.MIN_VALUE;
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("Invalid Index");
}


}


}
