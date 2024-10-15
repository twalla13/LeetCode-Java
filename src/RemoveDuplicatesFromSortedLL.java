public class RemoveDuplicatesFromSortedLL {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            //We are checking two nodes at a time!
            //Current != null tells us we are not at the end of the list
            //Current.next != null tells us we can compare the next element
            while(current != null && current.next != null){
                if(current.val != current.next.val){ //Not equal, move along the list
                    current = current.next;
                }else{ //If the two are duplicates
                    current.next = current.next.next;
                }
            }
            return head;
        }
        }
    }
}
