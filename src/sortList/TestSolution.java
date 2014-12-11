package sortList;

import java.util.LinkedList;

public class TestSolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(0);
		ListNode head = node;
		for(int index = 0;index < 10;index++){
			int temp = Math.round(index);
			ListNode tempNode = new ListNode(temp);
			node.next = tempNode;
			node = tempNode;
			
		}
		
		ListNode temp = new Solution().sortList(node);
		for(;;){
			if(temp.next!=null){
				System.out.println(temp.val);
			}
		}
		
	}

}
