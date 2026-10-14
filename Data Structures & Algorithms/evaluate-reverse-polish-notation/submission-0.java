class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> ops = Set.of("+", "-", "*", "/");

        List<Integer> stack = new ArrayList<>();

        for (int i = 0; i < tokens.length; i++) {
            if (ops.contains(tokens[i])) {
                int rightOperand = stack.removeLast();
                int leftOperand = stack.removeLast();
                int result = switch (tokens[i]) {
                    case "+" -> leftOperand + rightOperand;
                    case "-" -> leftOperand - rightOperand;
                    case "*" -> leftOperand * rightOperand;
                    case "/" -> leftOperand / rightOperand;
                    default ->
                        throw new IllegalStateException("Unsupported Operator : " + tokens[i]);
                };
                stack.add(result);
            } else {
                stack.add(Integer.valueOf(tokens[i]));
            }
        }
        return stack.removeLast();
    }
}
