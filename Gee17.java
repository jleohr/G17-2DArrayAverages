public class Gee17{
  public static void main(String[] args){

    int[][] ray = new int[7][7];

    //Populate the array with sequential numbers
    /*
      1  2  3  4  5  6  7
      8  9  10 11 12 13 14
      15 16 17 18 19 20 21
      22 23 24 25...
      */

    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
