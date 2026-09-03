public class Challenges1 
{
    public static void main(String[] args)
    {
    int a = 10; // a = 10
    int b = 20; // b = 20
    int c = a; // c = 10

    a = b;
    b = c;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    }
}
