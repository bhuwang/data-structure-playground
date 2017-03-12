/**
 * 
 */
package com.bhuwan.datastructure.stack;

/**
 * @author bhuwan
 *
 */
public class DijkstraTwoStackImpl {

    public static double evaluate(String expression) {
        LinkedListImpl<String> operandStack = new LinkedListImpl<>();
        LinkedListImpl<Double> valueStack = new LinkedListImpl<>();
        String[] operands = expression.split(" ");
        for (String operand : operands) {
            if (operand.equals("(")) {
                // do nothing
            } else if (operand.equals("+")) {
                operandStack.push(operand);
            } else if (operand.equals("*")) {
                operandStack.push(operand);
            } else if (operand.equals(")")) {
                String op = operandStack.pop();
                if (op.equals("+")) {
                    valueStack.push(valueStack.pop() + valueStack.pop());
                } else if (op.equals("*")) {
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
            } else {
                valueStack.push(Double.valueOf(operand));
            }
        }
        return valueStack.pop();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        double finalValue = DijkstraTwoStackImpl.evaluate("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        System.out.println("( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )");
        System.out.println("Final Value: " + finalValue);
    }

}
