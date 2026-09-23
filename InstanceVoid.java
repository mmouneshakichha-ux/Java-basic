import java.util.*;
public class InstanceVoid 
{
    //instance void -- object create
    void checkevenodd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
        System.out.println(" Odd ");
        }

    }
        

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();

        InstanceVoid obj = new InstanceVoid();

        obj.checkevenodd(n);
        
    }
}
    

