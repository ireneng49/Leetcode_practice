/**
 * 29. Merge Sort Linked List
 * Given a singly-linked list, where each node contains an integer value, sort it in ascending order. The merge sort algorithm should be used to solve this problem.

Examples

null, is sorted to null
1 -> null, is sorted to 1 -> null
1 -> 2 -> 3 -> null, is sorted to 1 -> 2 -> 3 -> null
4 -> 2 -> 6 -> -3 -> 5 -> null, is sorted to -3 -> 2 -> 4 -> 5 -> 6
 */

public class Solution {
    public ListNode mergeSort(ListNode head) {
      // Write your solution here
      if (head == null || head.next == null){
        return head;
      }
  
      ListNode middle = findMiddle(head);
      ListNode left_head = head;
      ListNode right_head = middle.next;
      middle.next = null;
  
      return merge(mergeSort(left_head),mergeSort(right_head));
    }
  
    public ListNode findMiddle(ListNode head){
      if (head == null){
        return head;
      }
      ListNode slow = head;
      ListNode fast = head;
      while (fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }
      return slow;
    }
  
    public ListNode merge(ListNode one, ListNode two){
      ListNode dummy = new ListNode(0);
      ListNode cur = dummy;
      while (one != null && two != null){
        if (one.value <= two.value){
          cur.next = one;
          one = one.next;
        } else {
          cur.next = two;
          two = two.next;
        }
        cur = cur.next;
      }
      if (one != null){
        cur.next = one;
      } else {
        cur.next = two;
      }
      return dummy.next;
    }
  }