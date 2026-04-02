class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null) {
            s1.insert(0, l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.insert(0, l2.val);
            l2 = l2.next;
        }

        // Add strings
        int i = s1.length() - 1, j = s2.length() - 1, carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (i >= 0 || j >= 0 || carry != 0) {
            int a = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int b = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = a + b + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}