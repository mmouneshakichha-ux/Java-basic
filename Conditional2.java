import java.util.*;
public class Conditional2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Cutezenship: True/False");
        boolean citizen = sc.nextBoolean();

        if(age >= 18)
        {
            if (citizen)
            {
                System.out.println("Eligible");
            }
            else
            {
            System.out.println("Not Eligible");
            }
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
