import java.util.*;

public class College_admission 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        System.out.println("Passed your exam?:");
        boolean pass = sc.nextBoolean();
        
        if(marks>=85 && pass == true)
        {
            System.out.println("Eligible");

        }
        
        else
        
        {
            System.out.println("Not eligible");
        }
sc.close();

    }
}
