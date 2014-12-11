package minStack;

class MinStack {
	
    Node top = null;

    /**
     * 入栈，在入栈的同时需要检查更新元素的最小值
     * @param x
     */
    public void push(int x) {
        if (top == null) {
            top = new Node(x);
            top.minValue = x;
        } else {
            Node temp = new Node(x);
            temp.next = top;
            top = temp;
            top.minValue = Math.min(top.next.minValue, x);
        }
    }

    /**
     * 出栈，只需要将当前元素节点的指针指向下一个元素即可
     */
    public void pop() {
        top = top.next;
        return;
    }

    /**
     * 获取栈顶元素（不为空则返回具体的值）
     * @return
     */
    public int top() {
        return top == null ? 0 : top.value;
    }

    /**
     * 从栈顶元素中拿到最小值
     * @return
     */
    public int getMin() {
        return top == null ? 0 : top.minValue;
    }
}