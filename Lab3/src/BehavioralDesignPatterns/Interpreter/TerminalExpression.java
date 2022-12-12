package BehavioralDesignPatterns.Interpreter;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class TerminalExpression implements Expression {
    private final Pattern data;

    public TerminalExpression(Pattern data) {
        this.data = data;
    }

    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if(test.matches(String.valueOf(data))) {
                return true;
            }
        } return false;
    }
}