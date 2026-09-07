public class CountOfDigits
{
    public static void main(String[] args)
    {
        int num = 54321;
        int count = 0;
        while(num > 0)
{
    num = num % 10;
    num = num /10;
    count++;

    

    }
    System.out.println("Count of digits = " + count);
    }

    
}
