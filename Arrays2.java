public class Arrays2
{
    static void PrintLeftToRight(int numbers[])
    {
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+ " --> ");

        }
    }
    static void printRightToLeft(int numbers[])
    {
        for(int i= numbers.length-1; i>=0; i--)
        {
            System.out.print(numbers[i]+" --> ");

        }
    

    }
    static void printFromBothSide(int num[])
    {
        int Left=0;
        int Right=num.length-1;
        while(Left<=Right)
        {
            System.out.print(num[Left]+ " --> " + num[Right]+ " --> ");
            //System.out.print(num[Right]+ " --> ");
            Left++;
            Right--;
        }

    }
    static void printFromCenterToEnd(int[] num)
{
        System.out.println("From Center To End");

        int left = num.length / 2 - 1;
        int right = num.length / 2;

        while (left >= 0 && right < num.length)
        {
            System.out.print(num[left] + " ");
            System.out.print(num[right] + " ");

            left--;
            right++;
        }
    
        

    }

    public static void main(String[] args)
    {
        int num[]={1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
        PrintLeftToRight(num);
        System.out.println();
        printRightToLeft(num);
            
        System.out.println();
        printFromBothSide(num);
        System.out.println();
        printFromCenterToEnd(num);




        }
        
    }


    

