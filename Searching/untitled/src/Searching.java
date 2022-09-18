public class Searching {
    public static int linearSearch(int arr[], int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==value){
                System.out.println("Value Found at index: "+i);
                return i;
            }
        }
        System.out.println("Value Not Found!!");
        return -1;

    }

    //Binary Search
    public static int  binarySearch(int arr[], int value){
        int start=0;
        int end=arr.length-1;
        int middle= (start+end)/2;

        while(arr[middle]!=value && start<=end){
            if(value< middle){
                end=middle-1;
            }else{
                start=middle+1;
            }
            middle=(start+end)/2;
        }
        if(arr[middle]==value){
            System.out.println("Element Found: " + middle);
            return middle;
        }else{
            System.out.println("Element NOT Found!!!! ");
            return -1;
        }

    }




}
