class Searchno{
  public static void main(String[] args){
    int[] intArray={1,2,3,4,5,6,7,8,9};
    Searchno ab= new Searchno();
    ab.searchno(intArray, 90);

  }
public void searchno( int[] intArray, int value){
  for(int i=0; i<intArray.length;i++){
    if(intArray[i]==value){
        System.out.println("value is found at index: "+ i);
        return;

    }
  }
  System.out.println(value+ "is not found");

}

}
