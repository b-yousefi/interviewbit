package interviewbit.stack;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class EvaluateExpressionTest {

    @Test
    public void evalRPN() {
        EvaluateExpression evaluateExpression = new EvaluateExpression();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("2");
        list1.add("1");
        list1.add("+");
        list1.add("3");
        list1.add("*");
        assertEquals(9, evaluateExpression.evalRPN(list1));
    }
}