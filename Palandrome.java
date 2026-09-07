import java.util.*;
public class Palandrome 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int reverse = 0;
        while(num > 0)
        {
            int digit = num % 10;
            reverse = reverse * digit + digit;
            num = num / 10;
        }
        if(num == reverse)
        {
            System.out.println("palandrome");
        }
        else
        {
            System.out.println("not palandrome");

        }
        
    }
    
}
