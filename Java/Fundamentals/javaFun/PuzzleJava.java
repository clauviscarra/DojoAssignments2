import java.util.Collections;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;


public class PuzzleJava {
  public ArrayList<Integer> greaterThanTen(int[] array){
    int sum =0;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i < array.length; i++){
      sum += array[i];
      if(array[i]>10){
        arr.add(array[i]);
      }
    }
    System.out.println(sum);
    return  arr;
  }
  //access modifier -->public is a modifier that defines the access type of the method (optional, defaults to public, as opposed to private and protected).
  //method type --> static is a class method that is invoked without reference to a particular object. Static methods can be called without creating an object of class. 


  public ArrayList<String> shuffleNames(){

    ArrayList<String> newArr = new ArrayList<>();
    ArrayList<String> arr = new ArrayList<>();
    arr.add("Nancy");
    arr.add("Jinichi");
    arr.add("Fujibayashi");
    arr.add("Momochi");
    arr.add("Ishikawa");

    Collections.shuffle(arr);

    for(int i = 0; i < arr.size(); i++){
      if(arr.get(i).length() > 5 ){
        newArr.add(arr.get(i));

      }
    }

    return newArr;

  }

public void shuffleAlphabet(){
  Random rnd = new Random();
  int rndNum;
  char tmp;
  char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  char[] vowel = {'a','e','i','o','u'};

    for(int i=0;i<alphabet.length;i++){
      rndNum = rnd.nextInt(alphabet.length);
      tmp = alphabet[i];
      alphabet[i] = alphabet[rndNum];
      alphabet[rndNum] = tmp;
    }
    System.out.println("Last Char: " + alphabet[alphabet.length-1]);

    for(int i=0;i<vowel.length;i++){
            if(alphabet[0] == vowel[i]){
                System.out.println("First letter is a vowel!");
                break;
            }
        }

    System.out.println("First Char: "+ alphabet[0]);

    }


  public String randomNumbers(){

    int[] numbers = new int[10];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = (numbers[i] = 55 + (int)(Math.random() * (100-55) + 1));
    }
    Arrays.sort(numbers);
    return Arrays.toString(numbers);

  }

  public static String randString(){
    Random rnd = new Random();
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String randString = "";

    for(int i=0;i<5;i++){
        randString += alphabet[rnd.nextInt(alphabet.length)];
    }
    return randString;
}

public static String randStrArr(){
  String[] arr = new String[10];

  for(int i=0;i<arr.length;i++){
      arr[i] = randString();
  }
  return Arrays.toString(arr);
}


}
