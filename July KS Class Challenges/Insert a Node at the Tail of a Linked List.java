 static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        if(head==null){
            head=n;
            return head;
        }
        
        
        SinglyLinkedListNode temp=head;
        
        while(temp.next!=null){
            temp=temp.next;
        }
        
        
        temp.next=n;
        
        return head;


    }
