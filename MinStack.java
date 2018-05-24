class MinStack {

    Stack<Node> s;
    int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        s = new Stack<Node>();

    }

    public void push(int x) {
        if(s.isEmpty()) min = x;
        s.push(new Node(x, min));
        if(x < min) {
            min = x;
        }

    }

    public void pop() {
        min = s.pop().last_min;
    }

    public int top() {
        return s.peek().val;
    }

    public int getMin() {
        return min;
    }

    private class Node {
        int val;
        int last_min;
        public Node() {}
        public Node(int val, int last_min) {
            this.val = val;
            this.last_min = last_min;
        }
    }
}
