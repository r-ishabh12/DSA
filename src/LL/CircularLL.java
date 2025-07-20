package LL;

public class CircularLL {
    private Node head;
    private Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if (head == null){
            head =node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value){
         Node temp = head;
       if (head == null) return;

       if (temp.val == value){
            head = head.next;
            tail.next = head;
            return;
       }

       do {
           Node n =temp.next;
           if (n.val == value){
               temp.next = n.next;
               break;
           }
           temp = temp.next;
       } while (temp != head);

    }

    public void display(){
        Node temp = head;
        if (head != null){
            do {
                System.out.print(temp.val + "->");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node{
       int val;
       Node next;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next) {
           this.val = val;
           this.next = next;
       }
   }
}
