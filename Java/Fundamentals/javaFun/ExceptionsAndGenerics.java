import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;


class ExceptionsAndGenerics
{
  public static void main(String[] args)
  {
    List<Integer> myList = new ArrayList<>();

    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");

    for( int i = 0; i < myList.size(); i++){
      try{
        int castedValue = (Integer)myList.get(i);
      }
      catch (RuntimeException e ){
        System.out.println("ERROR ON INDEX #" + myList.get(i);
        // System.err.println( e.getMessage());
      }
    }
  }
}
