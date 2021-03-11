public class Suite2 {
  
  public static String game(long n) {
    // your code
    String numerator;
    if(n%2==1){ // n is odd
      numerator = String.valueOf(n*n);
      String denominator = "2";
      return "[" + numerator + ", " + denominator + "]";
    }
    else{
      numerator = String.valueOf(n*n/2);
      return "[" + numerator + "]";
    }
  }
}
