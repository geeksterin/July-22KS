 public static void reversePrint(SinglyLinkedListNode head) {
    // Write your code here
        
        if(head==null){
            return ;
        }
        
        reversePrint(head.next);
        System.out.println(head.data);
        

    }
