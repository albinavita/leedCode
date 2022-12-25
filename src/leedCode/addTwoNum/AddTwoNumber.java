package leedCode.addTwoNum;
/*
Example 1:
2 -> 4 -> 3
5 -> 6 -> 4
-------------------
7 -> 0 -> 8

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class AddTwoNumber {
    public static void main(String[] args) {
        //ListNode l1 = new ListNode
    }

    public static ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode curr = node;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return node.next;
    }
}

