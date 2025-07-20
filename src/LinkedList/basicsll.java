package LinkedList;

public class basicsll {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void displayR(Node head){
        if (head == null) return;
        System.out.print(head.data + " ");
        displayR(head.next);
    }
    public static int length(Node head){
        int count = 0;
        while(head != null){
           count++;
            head = head.next;
        }
        return count;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node reverseList(Node head) {
        if(head == null){
            return head;
        }
        while(head != null){
            head.next = head;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(11);
        Node e = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

//        System.out.println(a.next.data);
//        System.out.print(a.data + "-> ");
//        System.out.print(a.next.data + "-> ");
//        System.out.print(a.next.next.data + "-> ");
//        System.out.print(a.next.next.next.data + "-> ");
//        System.out.print(a.next.next.next.next.data);

        //DISPLAYING LINKED LIST

//        Node temp = a;

//        for (int i = 0; i < 5; i++){
//            System.out.print(temp.data +" ");
//            temp = temp.next;
//        }

        // IF WE DONT KNOW THE LENGTH OF LINKED LIST THEN HOW WOULD WE DISPLAY THE LL

//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        // MKAING A FUNCTION FOR DIPLAYING

//        display(a);
        // CAN WE DO IT RECURSIVELY
//        displayR(a);

        //LENGTH METHOD

//        System.out.println(length(a));
        display(a);
        Node reverse = reverseList(a);
        display(a);

    }
}
