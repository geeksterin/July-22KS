 public static int findLengthOfll(SinglyLinkedListNode head){
        
        SinglyLinkedListNode temp=head;
        int length=0;
        
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        
        return length;
    }

    public static void reverseLinkedList(SinglyLinkedListNode right,int size, int length){
        
        if(right==null) return ;
        
        reverseLinkedList(right.next,size+1, length);
        
        if(size>=length/2){
            
            int temp=right.data;
            right.data=left.data;
            left.data=temp;

            left=left.next;
        }
    }
    
    static SinglyLinkedListNode left;
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
        
        int length = findLengthOfll(head);
        left=head;
        SinglyLinkedListNode right=head;
        
        reverseLinkedList(right,0,length);
        
        
        return head;
        
    }

