package LinkedListReverse;

public class Linked {

	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		
		ListNode reversed=reverserList(head);
		
		while(reversed!=null) {
			System.out.println(reversed.val+" ");
			reversed=reversed.next;
		}
	}

	private static ListNode reverserList(ListNode head) {
		ListNode prev=null;
		ListNode current=head;
		while(current!=null) {
			ListNode next = current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		return prev;
	}
}
