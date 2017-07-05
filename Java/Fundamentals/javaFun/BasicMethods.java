import java.util.ArrayList;
public class BasicMethods {
  public int findmax(int[] anArray){
    int max = anArray[0] ;
    for(int i =1; i < anArray.length; i++){
      if(anArray[i] > max){
        max = anArray[i];
      }
    }
    return max ;
  }
  public int average(int[] anArray){
    int sum = 0;
    for(int i = 0; i < anArray.length; i++){
      sum += anArray[i];
    }
    return sum / anArray.length;

  }

  public ArrayList<Integer> longarray(){
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i <= 255; i++){
      if(i % 2 == 1){
        arr.add(i);

      }
    }
    return arr;
  }

  public int greaterThanY(int[] arr, int y){
    ArrayList<Integer> arr2 = new ArrayList<>();
    for (int i = 0; i < arr.length; i++){
      if(arr[i]>y){
        arr2.add(i);
      }
    }
    return arr2.size();
  }

  public ArrayList<Integer> squarevals(int[] arr){
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < arr.length; i++){
      array.add(arr[i] * arr[i]);
    }
      return array;
  }

  public ArrayList<Integer> removenegative(int[] arr){
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 0; i < arr.length; i++){
      if(arr[i] < 0){
        array.add(0);
      }
      else{
      array.add(arr[i]);
      }
    }
    return array;
  }


  public ArrayList<Integer> minMaxAvg(int[] arr){
    ArrayList<Integer> array = new ArrayList<>();
    int max = arr[0];
    int min = arr[0];
    int sum = 0;

    for(int i =1; i < arr.length; i++){
      sum += arr[i];
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i]< min){
        min = arr[i];
      }

      }
      array.add(max);
      array.add(min);
      array.add(sum/arr.length);
      return array;

  }

  public ArrayList<Integer> shiftVal(int[] arr){
    ArrayList<Integer> array = new ArrayList<>();
    for (int i = 1; i < arr.length; i++){
      array.add(arr[i]);
    }
    return array;
  }

}
