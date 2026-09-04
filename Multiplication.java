import java.util.*;
public class Multiplication 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to multiplication");
        int num = sc.nextInt();

        // for(int i  = 1; i<=10; i++)
        // {
        //     System.out.println(i + " * " + num + " = "  + num *i);


        // }
        // int i = 1;
        // while(i<=10)
        //     {
        //         System.out.println(num + " * " + i + " =" + num *i);
        //         i++;

        // }
        int i=1;
        do
        {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;

        }
        while(i<=10);


        


    }
    
}
