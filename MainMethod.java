public class MainMethod
{
    static void calculateBasic()
    {
        System.out.println("Basic Calculated");
    }

    static void calculateHRA()
    {
        System.out.println("HRA Calculated");
    }

    static void calculateDA()
    {
        calculateHRA();
        System.out.println("DA Done");
    }

    static void calculateTax()
    {
        calculateDA();
        System.out.println("Tax Done");
    }

    static void calculateSalary()
    {
        calculateBasic();
        calculateTax();
        System.out.println("Final Salary");
    }

    public static void main(String[] args)
    {
        calculateSalary();
    }
}