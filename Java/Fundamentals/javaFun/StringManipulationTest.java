class StringManipulationTest {
  public static void main(String[] args) {
    StringManipulation iD = new StringManipulation();
    String newString = iD.trimAndConcat("he llo", "wo rld");
    System.out.println(newString);

    int newInt = iD.getIndexOrNull("aeiou$", "$");
    System.out.println(newInt);

    int newInt2 = iD.getIndexOrNull("la vaca eres tu", "eres");
    System.out.println(newInt2);
    String newString2 = iD.concatSubstring("Hello", 1, 2, "world");
    System.out.println(newString2);
  }
}
