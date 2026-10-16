public class InsertAtEnd
{
        
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
    {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args)
    {
        // testInsertAtStart();
        testInsertAtEnd();
    }

    public static void testInsertAtStart()
    {
        Node head = null;

        printList(head);

        head = insertAtStart(100, head);
        printList(head);

        head = insertAtStart(200, head);
        printList(head);
    }

    public static void testInsertAtEnd()
    {
        Node head = null;

        printList(head);

        head = insertAtEnd(100, head);
        printList(head);

        head = insertAtEnd(200, head);
        printList(head);

        head = insertAtEnd(300, head);
        printList(head);
    }

    public static Node insertAtStart(int value, Node head)
    {
        Node newNode = new Node(value);

        newNode.next = head;
        head = newNode;

        return head;
    }

    public static Node insertAtEnd(int value, Node head)
    {
        Node newNode = new Node(value);

        if (head == null)
        {
            return newNode;
        }

        Node current = head;

        while (current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    public static void printList(Node head)
    {
        Node current = head;

        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}


        