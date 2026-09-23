class Mounesha 
{
    void greet() 
    {
        System.out.println(" Hii ");
    }
    void printsum(int a, int b)
    {
        System.out.println("sum="+(a+b));
    }

    //3 No args but return
    int getNumber()
    {
        return 100;

    }

    //4
    int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;

    }
    public static void main(String[] args) 
    {
        Mounesha m = new Mounesha();
        m.greet();

        //2
        m.printsum(15, 20);

        //3
        int num = m.getNumber();
        System.out.println(num);

        //4
        int num2 = m.max(10, 15);
        System.out.println(num2);

        

    

        
        
    }
        
    }
