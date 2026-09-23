public class Method
{
    int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args)
    {
        int a  =10, b = 15;

        Method m = new Method();
        int c = m.max(10,20);
        System.out.println(c);

        

        
    }
    
}






