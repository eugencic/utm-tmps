package BehavioralDesignPatterns.Interpreter;

import java.util.regex.Pattern;

public class Interpreter {
    public static Expression buildInterpreterTree() {
        Expression keyWords = new TerminalExpression(Pattern.compile("(butterscotch|jawbreakers|skittles|twix|mars|nestle)"));
        return keyWords;
    }
}