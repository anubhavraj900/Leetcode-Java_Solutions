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
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head== null) return head;
        Stack<Integer> s=new Stack();
        ListNode dummy=head;
        ListNode current=dummy;
        ListNode last=null;
        int count =0;
        while(current!=null){
            count++;
             if(count==n+1){
                ListNode l=current;
                last=l;
                break;
            }
            if(count>=m && count<=n){
                s.push(current.val);
                current=current.next;
            }else{
                current=current.next; 
            }
        }
        
        
        int count2=0;
        ListNode dummy3=new ListNode(-1);
        ListNode dummy2=dummy3;
        ListNode current2=head;
        while(current2!=null){
            count2++;
            if(count2>=m && count2<=n){
                ListNode l=new ListNode(s.pop());
                dummy3.next=l;
                dummy3=dummy3.next;
                current2=current2.next;
            }else{
                ListNode l=current2;
                dummy3.next=l;
                dummy3=dummy3.next;
                current2=current2.next;
            }
        }
        
        
        return dummy2.next;
    }
}
