public static int middle_node(SinglyLinkedListNode head) {
    // Write your code here
        SinglyLinkedListNode fast=head;
        SinglyLinkedListNode slow=head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        
        return slow.data;

    }
