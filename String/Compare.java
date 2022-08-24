// import Scanner
import java.util.Scanner;
class Compare{
	public static void main(String[] args){
	// create Scanner obj
	Scanner input=new Scanner(System.in);
	System.out.println("Enter length of Array: ");
	int length=input.nextInt();
	//create array of length.;
	String[] s= new String[length];
	for(int i=0; i<length;i++){
	  s[i]=input.nextLine();
           }
	// PERFORM compare operations
	int k=0;
	for(int j=0; j<s.length;j++){
	String t= s[j];
	if(t.charAt(0)=='+' || t.charAt(t.length()-1)=='+'){
	k++;
}	else{
k--;
}
}
System.out.println(k);
}

}
