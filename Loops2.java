import java.util.*;
public class Loops2 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        String num = sc.next(); // "127" -->word
        boolean octal = true; // assume the number is octal

        for(int i = 0; i<num.length(); i++)
        {
            char ch  = num.charAt(i);
            if(ch < '0' || ch > '7')
            {
                octal = false;
                break;
            }
        }
            if(octal)
            {
                System.out.println("Yes radix = 8");
            }
            else
            {
                System.out.println("not an octal ");

            }




            

        }
        
    }
