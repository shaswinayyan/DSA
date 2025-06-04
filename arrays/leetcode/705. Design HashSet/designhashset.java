//705. Design HashSet

public class designhashset {
    
    private static class ListNode{
        int key;
        ListNode next;

        ListNode(int key){
            this.key = key;
        }
    }
    private final ListNode[] set;

    // public MyHashSet() {
    //     set = new ListNode[10000];
    //     for(int i =0;i<set.length;i++){
    //         set[i] = new ListNode(0);
    //     }
    // }

    public void add(int key){
        ListNode cur = set[key%set.length];
        while(cur.next!=null){
            if(cur.next.key==key){
                return;
            }
            cur = cur.next;
        }
        cur.next = new ListNode(key);
    }

    public void remove(int key){
        ListNode cur = set[key%set.length];
        while(cur.next!=null){
            if(cur.next.key==key){
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }


    
    public static void main(String[] args) {
        
    }
}
