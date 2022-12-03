public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
        
        SinglyLinkedListNode curr=head;
        SinglyLinkedListNode prev=null;
        
        
        while(curr!=null){
            
            SinglyLinkedListNode fwd=curr.next;
            
            curr.next=prev;
            
            prev=curr;
            curr=fwd;
        }
        
        head=prev;
        
        return head;

    }
