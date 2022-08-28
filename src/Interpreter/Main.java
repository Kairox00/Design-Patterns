package Interpreter;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence";

    EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    context = endsWithPeriod.interpret(context);

    System.out.println(context);

  }

}
