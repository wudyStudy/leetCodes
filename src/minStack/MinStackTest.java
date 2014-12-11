package minStack;

public class MinStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MinStack minStack = new MinStack();
		
		for(int index = 0;index < 10;index++){
			minStack.push(index);
		}
		
		System.out.println("栈顶元素:"+minStack.top());
		System.out.println("最小元素:"+minStack.getMin());
		System.out.println("栈顶元素出栈");
		
		minStack.pop();
		
		System.out.println("栈顶元素:"+minStack.top());
		System.out.println("最小元素:"+minStack.getMin());
	}

}
