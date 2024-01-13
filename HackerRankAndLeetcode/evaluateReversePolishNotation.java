public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
        switch (token) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "-":
                int op2 = stack.pop();
                int op1 = stack.pop();
                stack.push(op1 - op2);
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "/":
                op2 = stack.pop();
                op1 = stack.pop();
                stack.push(op1 / op2);
                break;
            default: // Assume it's a number
                stack.push(Integer.parseInt(token));
        }
    }

    return stack.pop(); // Final result
}
