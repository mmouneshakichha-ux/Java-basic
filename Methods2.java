public class Methods2 
{

        static int max(int x, int y)
    {
        if(x > y)
            return x;
        else
            return y; // return 15

        //scope checking
        //System.out.println(a); // a is not in this method

    }
    
    public static void main(String[] args) 
    {
        int a =10, b = 15;

        int c = max(a,b);
        System.out.println(c);

        
    }
    
}
