package Behavioral.Interpreter;

public class EndsWithPeriod implements Expression{
    private NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

    @Override
    public String interpret(String context) {
        context = HelperMethods.endsWithPeriod(context);
        return noRepeatedWords.interpret(context);
    }
}
