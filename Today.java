public class Today 
{
    public static void main(String [] args)
    {
        byte a = 10;
        byte b = 20;
        //byte c = a+b; --> Wrong lossy conversion
        int c = a+b; // Type promotion
        System.out.println(c);

        // byte --> int
        /*byte a = 10;
        short b = 20;
        
        short result = a+b; work because byte consider as int so int greter than short*/
        /*int = long
        int a = 10;
        int b = 20;
    
    long result = a + b;
    Syste.out.println(result);
    int --> boolean:
    /*int a = 10
    boolean b = true;*/

    /*boolean Result a + b; */

    //float -> double:
    /* float a = 10.5f;
    double b = 20;
    double result = a + b; */

    /* char a= 'A';
    char b= 'B';
    int result = a + b; */

    /* short a = 10;
    char b = 'A';
    int result = a + b;/*
    
    /* char a = 'A';
    int b = 10;
    int result = a + b;*/

    long x = 10L;
    float y= 20.1f;
    float result = x+y;

    System.out.println(result);



    }
}
