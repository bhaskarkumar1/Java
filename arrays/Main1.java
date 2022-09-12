import java.util.Arrays;

class Main1{
  public static void main(String[] args){
Singledimensionarray sda =new Singledimensionarray(10);
sda.insert(0,0);
sda.insert(1,10);
sda.insert(2,20);
sda.insert(1,30);
sda.insert(12,120);

// accessing arrays element
System.out.println("// accessing arrays element");
var firstElement= sda.arr[0]; //O1
System.out.println(firstElement);

System.out.println("// Array traversal");
sda.traversalArray();

System.out.println("// Search in array");
sda.searchArray(10);

System.out.println("// Delete in arrays");
sda.deleteValue(0);
System.out.println(sda.arr[0]);

  }
}
