public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
    // Write your code here
        if(position ==0){
            head=head.next;
            return head;
        }
        
        SinglyLinkedListNode temp1=null;
        SinglyLinkedListNode temp2=head;
        
        
        for(int i=0;i<=position-1;i++){
            temp1=temp2;
            temp2=temp2.next;
        }
        
        
        temp1.next=temp2.next;
        temp2.next=null;
        
        return head;

    }
