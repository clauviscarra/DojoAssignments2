public class HelloWorld { //HelloWorld is a class, you can't write a function that does not belong to a class.
  public static void main(String[] args) { //main() is a method, which is a name for a function that belongs sto a class. In Java, every function is a method. Main() is a method that defines the entry point for an executable Java file. We put our custom code inside main(), we can't change its parameters or return type.
    System.out.println("Hello World!"); //System.out.println() prints to terminal.
  }
}


//Java is case sensitive.
//Class names are written in PascalCase (each word is capitalize w no spaces)
//All method names should start w lower case. If multiple words, then lowerCamelCase. Normally, methods are verbs.
//The name of the file should match the class name.
//main() is mandatory for executable Java programs.
//for main() method --> public : access modifier, can be accessed through any other class or method in project.
  // static --> method belongs to and is called from the class itself rather than a class instance.
  //void --> main() method doesn't return anything.
