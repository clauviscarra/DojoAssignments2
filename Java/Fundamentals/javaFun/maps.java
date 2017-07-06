import java.util.HashMap;


public class maps{
public static void main(String[] args) {
  HashMap <String, String> userMap = new HashMap<>();
  userMap.put("ninja@coding.com", "Nancy Ninja");
  userMap.put("samurai@coding.com", "Sam Samurai");

  String name = userMap.get("samurai@coding.com");

  System.out.println(name);
}



}
