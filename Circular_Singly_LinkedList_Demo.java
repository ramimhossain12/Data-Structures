/*
  
    Programmed by: Ramim Hossain
    Contact: https://ramimhossain.com/
*/



package Ramim_Apps_Ltd.company.ff;

public class Circular_Singly_LinkedList_Demo {

    private ListNode last;
    private int length;

    private  class  ListNode{

        private ListNode next;
        private  int data;

        public ListNode(  int data) {
            this.data = data;
        }
    }

    public Circular_Singly_LinkedList_Demo(){
        last = null ;
        length =0;

    }

    public  int length(){
        return length;
    }

    public  boolean isEmpty(){
        return length == 0;
    }
    public  void  createCircularLinkList() {

    ListNode first  = new ListNode(1);
    ListNode second  = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth  = new ListNode(4);

    first.next = second;
    second.next =third;
    third.next =fourth;
    fourth.next = first;

    last = fourth;
    }

    public static void main(String[] args) {


        Circular_Singly_LinkedList_Demo clsl = new Circular_Singly_LinkedList_Demo();

        clsl.createCircularLinkList();


    }
}
