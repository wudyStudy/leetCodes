package minStack;

class MinStack {
	
    Node top = null;

    /**
     * ��ջ������ջ��ͬʱ��Ҫ������Ԫ�ص���Сֵ
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
     * ��ջ��ֻ��Ҫ����ǰԪ�ؽڵ��ָ��ָ����һ��Ԫ�ؼ���
     */
    public void pop() {
        top = top.next;
        return;
    }

    /**
     * ��ȡջ��Ԫ�أ���Ϊ���򷵻ؾ����ֵ��
     * @return
     */
    public int top() {
        return top == null ? 0 : top.value;
    }

    /**
     * ��ջ��Ԫ�����õ���Сֵ
     * @return
     */
    public int getMin() {
        return top == null ? 0 : top.minValue;
    }
}