import java.util.*;
public class Loops3 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        while (num > 0)
        {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
        System.out.println(num);
        System.out.println("Loops ends if num = 0");


    }
}
