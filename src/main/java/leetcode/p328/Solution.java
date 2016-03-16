package leetcode.p328;
public class Solution {

    public ListNode oddEvenList(ListNode head) {
        
        if(head == null){
            return null;
        }

        ListNode oddTail = null;
        ListNode evenTail = null;
        ListNode evenHead = head.next;
        ListNode current = head;
        while (true) {
            if (current == null) break;
            if (oddTail == null) {
                oddTail = current;
            } else {
                oddTail.next = current;
                oddTail = oddTail.next;
               
            }
            current = current.next;
            oddTail.next = null;

            if (current == null) break;
            if (evenTail == null) {
                evenTail = current;
            } else {
                evenTail.next = current;
                evenTail = evenTail.next;
               
            }
            current = current.next;
            evenTail.next = null;

        }
        oddTail.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode current = head;
        for (int i = 2; i < 10; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }
        head = new Solution().oddEvenList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    static class ListNode {

        int      val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
