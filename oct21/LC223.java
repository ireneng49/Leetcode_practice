/**
 * 223. Add Two Numbers
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.  

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

Output: 7 -> 0 -> 8
 
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
      // Write your solution here
      ListNode dummy = new ListNode(0);
      ListNode cur = dummy;
      int val = 0;
  
      while (a != null || b != null || val != 0){
        if (a != null){
          val += a.value;
          a = a.next;
        }
        if (b != null){
          val += b.value;
          b = b.next;
        }
  
        cur.next = new ListNode(val % 10);
        cur = cur.next;
        val = (val / 10);
      }
      return dummy.next;
    }
  }
  