class Casting {
  public static void main(String[] args) {
    double d = 35.25;
    double dd = 35.99;
    //casting the double d into an int

    int i = (int) d;
    int ii = (int) dd;

    int g = 35;
    float f = g;


    System.out.println(i);//(explicit casting)
    System.out.println(d);//(explicit casting)
    System.out.println(ii);//(explicit casting)
    System.out.println("The number is: " + f);
  }
}
