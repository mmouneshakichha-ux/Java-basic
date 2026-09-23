public class PassObject 
{
    static void update(int b[])
{
    b[0] = 100;
    System.out.println("inside update:" + b[0]);

    }
    public static  void main(String[] args)
{
    int a[] = {10,20,30,40};
    System.out.println("Before Method Call:" + a[0]);

    update(a);

    System.out.println("After Call:" + a[0]);

    }
    
}
