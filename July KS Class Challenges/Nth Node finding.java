Approach -01

public static int node_finding(SinglyLinkedListNode head, int N) {
    // Write your code here
        
        SinglyLinkedListNode temp=head;
        int length=0;
        
        while(temp!=null){
            length++;
            temp=temp.next;
        }

        int NthNodefromStarting =length-N+1;
        
        temp=head;
        
        for(int i=1;i<NthNodefromStarting;i++){
            temp=temp.next;
        }
        
        
        return temp.data;
        
        
    }




Approach -02
  
    public static int node_finding(SinglyLinkedListNode head, int N) {
    // Write your code here
        
        SinglyLinkedListNode fast=head;
        SinglyLinkedListNode slow=head;
        
        
        for(int i=1;i<=N;i++){
            fast=fast.next;
        }
        
        
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        
        return slow.data;
        
        
        
    }
