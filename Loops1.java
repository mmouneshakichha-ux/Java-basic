import java.util.*;
public class Loops1 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int Start = sc.nextInt();

        System.out.println("Enter a number");
        int end = sc.nextInt();

    //     for(int i = Start; i<=end; i++)
    // {
    //     System.out.println(i*i);
    

    // }
    // int i = Start;
    // while(i<=end)
    //     {
    //         System.out.println(i * i);
    //         i++;

    // }
    int i = Start;
    do
    {
        System.out.println(i * i);
        i++;

    }
    while( i <= end);


    }
}
