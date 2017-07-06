import java.util.ArrayList;

public class PuzzleJavaTest{
  public static void main(String[] args) {
    int[] anArray;
    anArray = new int[10];
    anArray[0] = 3;
    anArray[1] = 5;
    anArray[2] = 1;
    anArray[3] = 2;
    anArray[4] = 7;
    anArray[5] = 9;
    anArray[6] = 8;
    anArray[7] = 13;
    anArray[8] = 25;
    anArray[9] = 32;




    PuzzleJava iD = new PuzzleJava();

    ArrayList<Integer> greaterThanTen = iD.greaterThanTen(anArray);
    System.out.println(greaterThanTen);

    ArrayList<String> shuffleNames=iD.shuffleNames();
    System.out.println(shuffleNames);

    iD.shuffleAlphabet();

    String randomNumbers = iD.randomNumbers();
    System.out.println(randomNumbers);

    String randString = iD.randString();
    System.out.println(randString);

    String randStrArr = iD.randStrArr();
    System.out.println(randStrArr);


  }
}
