public class MyArray
{
    int[] array;//place to store elements
    int length;//total size of the array
    int RightIndex;//pointing at empty box

    public MyArray()
    {
        length = 5;
        array = new int[length];
        RightIndex = 0;


    }

    //insert at the end
    public void insertAtEnd(int value)
    {
        if(RightIndex == length)
        {
            System.out.println("Array is full");
            return;


        }
        else
        {
            //shift elements one position to the right
            for(int i=RightIndex-1; i>=0; i--)
            {
                array[i+1] = array[i];

            }

        }
        //insert
        array[0]=value;
        RightIndex++;
    }

    //insert at any position
    public void insertAtposition(int value, int position)
    {
        if(RightIndex == length)
        {
            System.out.println("invalid position");
            return;

        }

        //shift and insert
        for(int i=RightIndex-1; i>=position; i--)
        {
            array[i+1] = array[i];

        }
        array[position] = value;
        RightIndex++;

    }

    //=============Deletion=========================

    //Delete from end
    public void deleteFromEnd()
    {
        if(RightIndex == 0)
        {
            System.out.println("Array is empty");
            return;

        }

        //shift elelments from index = 0(from start)
        for(int i = 0; i<RightIndex-1; i++)
        {
            array[i] = array[i+1];


        }
        RightIndex--;
        array[RightIndex] = 0;

    }

    // Delete from position
    public void deleteFromPosition(int position)
    {
        if (RightIndex == 0)
        {
            System.out.println("Array is empty");
            return;
        }

        if (position < 0 || position >= RightIndex)
        {
            System.out.println("Invalid position");
            return;
        }

        // Shift elements to the left
        for (int i = position; i < RightIndex - 1; i++)
        {
            array[i] = array[i + 1];
        }

        RightIndex--;
        array[RightIndex] = 0;
    }

    // ================= PRINT =================

    // Print elements
    public void printElements()
    {
        System.out.println("Index\tValue");

        for (int i = 0; i < RightIndex; i++)
        {
            System.out.println(i + "\t" + array[i]);
        }
    }
    public static void main(String[] args)
    {
        MyArray arr = new MyArray();

        System.out.println("Initial Array");
        arr.printElements();

        arr.insertAtEnd(10);
        arr.insertAtEnd(20);
        arr.insertAtEnd(30);
        arr.insertAtEnd(40);
        arr.insertAtEnd(50);

        System.out.println("After inserting elements");
        arr.printElements();
        
    }
}