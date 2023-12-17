class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return null;
        }
        
        ListNode node =new ListNode();
        node.next = head;
        ListNode temp = node;
        while(temp.next!=null){
            if(temp.next.val==val){
                temp.next= temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return node.next;
    }
}
