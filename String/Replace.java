import java.util.Scanner;

class Replace{
public static void main (String[] args){
	// create  a Scanner Object
	Scanner input=new Scanner(System.in);
	// read Line 
	String address= input.nextLine();

	String s=address.replace(".","[.]");

	System.out.println(s);
}
}
