 public static boolean  reverseLinkedList(SinglyLinkedListNode right){
        
        if(right==null) return true;
        
        boolean ans= reverseLinkedList(right.next);
        if(ans==false) return false;
        if (right.data!=left.data) return false;

        left=left.next;
        return true;
        
    }
    
    static SinglyLinkedListNode left;
    public static void palindromic(SinglyLinkedListNode head) {
    // Write your code here 
        // int length = findLengthOfll(head);
        left=head;
        SinglyLinkedListNode right=head;
        
        boolean ans=reverseLinkedList(right);
        
        
        if(ans==true){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
