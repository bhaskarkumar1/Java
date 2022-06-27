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



}
