package Interpreter;

public class FirstLetterUppercase implements Expression{

    @Override
    public String interpret(String context) {
        context = HelperMethods.firstLetterLowerCase(context);
        return context;
    }
}
