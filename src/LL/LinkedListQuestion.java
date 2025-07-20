package LL;

import java.sql.SQLOutput;

public class LinkedListQuestion {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListQuestion() {
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertL(int val){
        if (tail == null){
            insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
       size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteDuplicates() {
        Node temp = head;
       while (temp.next != null){
           if (temp.val == temp.next.val){
               temp.next = temp.next.next;
           }else{
               temp = temp.next;
           }
       }
       tail = temp;
       tail.next = null;
    }
    //merge
    public static LinkedListQuestion merge(LinkedListQuestion first ,LinkedListQuestion second){
        Node f = first.head;
        Node s = second.head;

        LinkedListQuestion ans = new LinkedListQuestion();

        while (f != null && s != null){
            if (f.val < s.val){
                ans.insertL(f.val);
                f = f.next;
            } else{
                ans.insertL(s.val);
                f = s.next;
            }
        }
        while (f!=null){
            ans.insertL(f.val);
            f = f.next;
        }
        while(s!=null){
            ans.insertL(s.val);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
//        LinkedListQuestion list = new LinkedListQuestion();
//        list.insertL(1);
//        list.insertL(1);
//        list.insertL(1);
//        list.insertL(2);
//        list.insertL(4);
//        list.insertL(4);
//        list.display();
//        list.deleteDuplicates();
//        list.display();
        LinkedListQuestion list1 = new LinkedListQuestion();
        LinkedListQuestion list2 = new LinkedListQuestion();
        list1.insertL(1);
        list1.insertL(3);
        list1.insertL(5);
        list1.display();
        list2.insertL(1);
        list2.insertL(2);
        list2.insertL(9);
        list2.insertL(14);
        list2.display();
        LinkedListQuestion ans = LinkedListQuestion.merge(list1,list2);
        ans.display();
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
