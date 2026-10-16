public class List 
{
    public static void main(String[]args)
    {
        Node head = Insert(100, 200, 300);

        head = InsertAtStart(50, head);

        //head = DeleteAtStart(head);

        //head = DeleteAtEnd(head);

        head = DeletKeyNode(100,head);

        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    

    public static Node Insert(int data1,int data2,int data3)
    {
        Node firstNode = new Node();
        firstNode.data = data1;

        Node secNode = new Node();
        secNode.data = data2;

        Node thNode = new Node();
        thNode.data = data3;

    

        firstNode.next = secNode;
        secNode.next = thNode;
        thNode.next = null;

        Node head = firstNode;

        return head;

        
    }

    public static Node DeleteAtStart(Node head)
    {
        if(head == null)
        {
            return null;
        }
        head = head.next;
        return head;
    }

    public static Node DeleteAtEnd(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node lastNode = head;
        while(lastNode.next.next != null)
        {
            lastNode = lastNode.next;
        }
        lastNode.next = null;
        return head;
    }

    public static Node DeletKeyNode(int key, Node head)
    {
        if(head == null)
        {
            return null;
        }

        // If first node contains the key
        if(head.data == key)
        {
            head = head.next;
            return head;
        }

        Node temp = head;

        // Find the node before the key node
        while(temp.next != null && temp.next.data != key)
        {
            temp = temp.next;
        }

        // Key not found
        if(temp.next == null)
        {
            return head;
        }

        // Delete the key node
        temp.next = temp.next.next;

        return head;
    }
    

    public static Node InsertAtStart(int data,Node head)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;

        head = newNode;
        return head;
    }
}