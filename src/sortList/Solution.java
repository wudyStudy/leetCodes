package sortList;

public class Solution {

	public ListNode sortList(ListNode head) {
		ListNode slow_p = head;
		ListNode fast_p = head;
		if (head == null) {
			return null;
		}
		ListNode pre = head;
		while(slow_p.next != null && fast_p != null && fast_p.next != null ){
			pre = slow_p;
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
		}
		pre.next = null;
		ListNode res = mergeSort(head,  slow_p);
		return res;
    }
	private ListNode mergeSort(ListNode l1, ListNode l2){
		if (l2 == null || l1 == l2) {
			return l1;
		}
		if(l1 == null){
			return l2;
		}
		ListNode slow_p = l1;
		ListNode fast_p = l1;
		ListNode pre = l1;
		while(slow_p.next  != null && fast_p != null && fast_p.next != null ){
			pre = slow_p;
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
		}
		pre.next = null;
		ListNode head1 = mergeSort(l1,  slow_p);
		slow_p = l2;
		fast_p = l2;
		pre = l2;
		while(slow_p.next  != null && fast_p != null && fast_p.next != null ){
			pre = slow_p;
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
		}
		pre.next = null;
		ListNode head2 = mergeSort(l2, slow_p);
		ListNode res = new ListNode(0);
		ListNode cur = res;
		while (head1 != null && head2 != null) {
			if (head1.val < head2.val) {
				cur.next = head1;
				head1 = head1.next;
			}
			else{
				cur.next = head2;
				head2 = head2.next;
			}
			cur = cur.next;
		}
		while (head1 != null) {
			cur.next = head1;
			head1 = head1.next;
			cur = cur.next;
		}
		while (head2 != null) {
			cur.next = head2;
			head2 = head2.next;
			cur = cur.next;
		}
		return res.next;
	}
	
}
