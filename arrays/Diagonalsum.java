class Diagonalsum{
public static void main(String[] args) {
    int[][] myarr={{1,2,3},{4,5,6},{7,8,9}};
    Diagonalsum ab= new Diagonalsum();
    int result=ab.diagonalsum(myarr);
    System.out.println(result);
  }
public int diagonalsum(int[][] myarr){
  int sum=0;
  if(myarr.length==myarr[0].length){
    for (int i=0;i<myarr.length ;i++ ) {
      sum+=myarr[i][i];

    }

  }
    return sum;
}


}
