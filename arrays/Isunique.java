class Isunique{
  public static void main(String[] args){
    int[] intArray={1,2,3,4,5,6,7,8,9,9};
   Isunique ab=new Isunique();
   boolean result=ab.isunique(intArray);
   System.out.println(result);


  }
 public boolean isunique(int[] intArray){
   for (int i=0;i<intArray.length ;i++ ) {
     for(int j= i+1; j<intArray.length; j++){
       if(intArray[i]==intArray[j]){
         return false;
       }
     }
   }
   return true;
 }




}
