package Interpreter;

public class NoRepeatedWords implements Expression{
    private FirstLetterUppercase firstLetterUppercase = new FirstLetterUppercase();

    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        return firstLetterUppercase.interpret(context);
    }
}