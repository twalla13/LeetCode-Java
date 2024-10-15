import java.util.List;

public class RemoveNthNodeFromEndofLL {
    public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode curr = head;

         //Move curr n steps ahead with for loop
        for(int i = 0 ; i < n ;i++){
            curr = curr.next;
        }

        if(curr == null){ //In the case if length of list == n but didnt find length
            //So if curr has moved n steps ahead and it is null then we are at the end
            return head.next;
        }
         ListNode nPointer = head;


         while(curr.next != null){ // Stops when current node is on the last node (curr.next == null)
            curr = curr.next;
            nPointer = nPointer.next;
         }

         nPointer.next = nPointer.next.next; // nPointer in the node before we want to remove it, so you want the next pointer to go over 2

        return head;
    }

    }
}
