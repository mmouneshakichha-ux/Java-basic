public class Arrays1 
{
    static void PrintLeftToRight(int num[])
    {
        for(int i=0; i<num.length; i++)
        {
            System.out.print(num[i]+ " -> ");

        }
    }
    public static void main(String[] args)
    {
        int num[]={1, 2, 3, 4, 5, 6 , 7, 8, 9, 10};
        PrintLeftToRight(num);

        }
        
    }
    

