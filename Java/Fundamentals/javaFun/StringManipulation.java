public class StringManipulation {
  public String trimAndConcat(String string1, String string2){
    String string3 = string1.trim().concat(string2.trim());
    return string3;

  }
  public int getIndexOrNull(String string1, char a){
    int c = string1.indexOf(a);
    return c;

  }

  public int getIndexOrNull(String string1, String string2){
    int string4 = string1.indexOf(string2);
    return string4;
  }

  public String concatSubstring(String string1, int int1, int int2, String string2){
    String string3 = string1.charAt(int1) + string2;
    return string3;
  }
}
