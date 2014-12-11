package InsertionSortList;


public class TestSoltion {

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

		ListNode result = new Solution().insertionSortList(head);
		
		while(result.next!=null){
			System.out.println(result.val);
			result = result.next;
		}
 
	}

}
