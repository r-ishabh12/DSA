package LL;

public class LinkedListImplementation {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListImplementation() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node =new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index ;i++){
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.val;
        tail = secondLast;
        tail.next = null;
        return value;
    }
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.val;
        prev.next = prev.next.next;

        size--;
        return val;
    }

    public void insertRecursion(int value, int index){
        head = insertrec(value, index, head);
    }
    private Node insertrec(int val, int index, Node node){
        if (index == 0){
           Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertrec(val, index-1,node.next);
        return node;
    }

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
    //Questions
    public  void deleteDuplicates() {
      Node node = head;
        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(4);
        list.insertLast(4);
        list.display();
        list.deleteDuplicates();
        list.display();

    }


}
