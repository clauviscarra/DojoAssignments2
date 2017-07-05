import java.util.ArrayList;
public class Basics {
  public static void main(String[] args) {
    int sum = 0;
    int[] anArray;
    for(int i = 0; i <= 255; i++ ){

      sum += i;
      // System.out.println(i);
      System.out.println(sum);
    }
    // for(int j = 0; j <= 255; j++ ){
    //   if (j % 2 == 1){
    //     System.out.println(j);
    //   }
    // }
    anArray = new int[6];
    anArray[0] = 1;
    anArray[1] = 5;
    anArray[2] = 10;
    anArray[3] = 7;
    anArray[4] = -2;
  

    for(int a =0; a < anArray.length; a++){
      System.out.println(anArray[a]);
    }

    BasicMethods iD = new BasicMethods();
    int maxVal = iD.findmax(anArray);
    System.out.println("your max is " + maxVal);

    int avrg = iD.average(anArray);
    System.out.println("average is " + avrg);

    ArrayList<Integer> arraylong = iD.longarray();
    System.out.println(arraylong);

    int greaterThanY = iD.greaterThanY(anArray, 9);
    System.out.println(greaterThanY);

    ArrayList<Integer> squarevals = iD.squarevals(anArray);
    System.out.println(squarevals);

    ArrayList<Integer> removenegative = iD.removenegative(anArray);
    System.out.println(removenegative);

    ArrayList<Integer> minMaxAvg = iD.minMaxAvg(anArray);
    System.out.println(minMaxAvg);

    ArrayList<Integer> shiftVal = iD.shiftVal(anArray);
    System.out.println(shiftVal);

  }
}
