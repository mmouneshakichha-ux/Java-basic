import java.util.*;
public class EvenOdd 
{
    //static void
    static void checkEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");

        }
        System.out.println(" Odd ");

        }
        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc. nextInt();

        checkEvenOdd(n);

    }
    
}
