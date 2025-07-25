package LL;

public class ReverseLinkedList {
    private Node head;
    private Node tail;
    //recursion reverse
    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    //inPlace reversal 

}
