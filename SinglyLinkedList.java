public class SinglyLinkedList 
{
    public static void main(String[] args) 
    { 
        Node newnode = new Node();
        newnode.data = 100;
        newnode.next =null;
        System.out.println(newnode.data);
        System.out.println(newnode.next);

        Node secondnode = new Node();
        newnode.data=101;
        newnode.next =null;

        newnode .next = secondnode;

        System.out.println(newnode.data);
        System.out.println(newnode.next);
        System.out.println(newnode.next.next.next);
        
    }

    

}
