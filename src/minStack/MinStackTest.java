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
		
		System.out.println("ջ��Ԫ��:"+minStack.top());
		System.out.println("��СԪ��:"+minStack.getMin());
		System.out.println("ջ��Ԫ�س�ջ");
		
		minStack.pop();
		
		System.out.println("ջ��Ԫ��:"+minStack.top());
		System.out.println("��СԪ��:"+minStack.getMin());
	}

}
