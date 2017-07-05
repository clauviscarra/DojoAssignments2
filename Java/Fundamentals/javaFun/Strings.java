public class Strings {
  public static void main(String[] args) {
    String ninja = "Coding Dojo is Ok I guess ";
    String string1 = "*Le sigh* ";
    String string2 = ninja.concat(string1);
    int length = ninja.length();
    int c = ninja.indexOf("Ok");
    System.out.println(string2 + length + c);
  }
}
