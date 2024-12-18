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
    public ListNode mergeKLists(ListNode[] lists) {
         if(lists.length==0)return null;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode x=lists[i];
            while(x!=null){
                al.add(x.val);
                x=x.next;
            }
        }
        Collections.sort(al);
        ListNode dup=new ListNode(0);
        ListNode t=dup;
        for(int i=0;i<al.size();i++){
            ListNode a=new ListNode(al.get(i));
            t.next=a;
            t=t.next;
        }
        return dup.next;
    }
}