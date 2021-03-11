class Potatoes {
    
    public static int potatoes(int p0, int w0, int p1) {
        // your code
      int finalWeight = (w0*(100-p0))/(100-p1);
      return finalWeight;
    }
}
