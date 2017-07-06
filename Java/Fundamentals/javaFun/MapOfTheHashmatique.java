import java.util.HashMap;

public class MapOfTheHashmatique{
  public static void main(String[] args) {
    HashMap <String, String> trackList = new HashMap<>();
    trackList.put("SONG 1", "You're so beautiful, a contradiction");
    trackList.put("SONG 2", "Bears will not destroy us");
    trackList.put("SONG 3", "I just wanted to hoooooold");
    trackList.put("SONG 4", "In my aaaarms");

    String song = trackList.get("I will be");
    for(String key : trackList.keySet())
    {
      System.out.println(key + " : " + trackList.get(key));
    }



  }
}
