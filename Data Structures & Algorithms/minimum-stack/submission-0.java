class MinStack {
    private final List<Integer> values;
    private final List<Integer> minValues;

    public MinStack() {
        this.values = new ArrayList<>();
        minValues = new ArrayList<>();
    }

    public void push(int val) {
        values.add(val);
        if (minValues.isEmpty()) {
            minValues.add(val);
        } else if (minValues.getLast() >= val) {
            minValues.add(val);
        }
    }

    public void pop() {
        int val = values.removeLast();
        if (!minValues.isEmpty() && minValues.getLast() == val) {
            minValues.removeLast();
        }
    }

    public int top() {
        return values.getLast();
    }

    public int getMin() {
        return minValues.getLast();
    }
}
