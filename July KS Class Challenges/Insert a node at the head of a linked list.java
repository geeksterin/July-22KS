 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        
        n.next=head;
        
        head=n;
        
        return head;
    }
