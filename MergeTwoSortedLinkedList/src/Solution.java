public class Solution {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode curro=head;
        while(curro!=null){
            System.out.println(curro.data);
            curro=curro.next;
        }
    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        while (l1!=null && l2!=null){
            if (l1.data<l2.data){
                curr.next=l1;
                l1=l1.next;
            } else {
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if (l1!=null){
            curr.next=l1;
            l1=l1.next;
        }

        if (l1!=null){
            curr.next=l2;
            l1=l1.next;
        }
        return temp.next;

    }

    public static void main(String[] args) {
        Solution ll=new Solution();
        ListNode myo=new ListNode(10);
        ListNode first=new ListNode(20);
        ListNode sec=new ListNode(65);
        ll.head=new ListNode(75);
        ll.head.next=myo;
        myo.next=first;
//        ll.display();
        Solution ll2=new Solution();
        ListNode third=new ListNode(55);
        ListNode fourth=new ListNode(85);
        ListNode fifth=new ListNode(99);

        ll2.head=new ListNode(22);
        ll2.head.next=third;
        third.next=fourth;
        fourth.next=fifth;
        Solution.merge(ll.head,ll2.head);

        Solution res=new Solution();
        res.head=merge(ll.head,ll2.head);
        res.display();
    }

}
