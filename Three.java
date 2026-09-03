

public class Three 
{
    public static void main(String[] args)
    {
       //Three Numbers Swap

        int Value1 = 10;
        int Value2 = 20;
        int Value3 = 30;

        System.out.println();
        System.out.println("Value1 before Swapping: " + Value1);
        System.out.println();
        System.out.println("Value2 before Swapping: " + Value2);
        System.out.println();
        System.out.println("Value3 before Swapping: " + Value3);

        //Logic- Three Number
        Value1 = Value1 + Value2; //Value2 = 30
        Value2 = Value3 - Value2; // Value2 = 10
        Value3 = Value1 - Value2; // Value3 = 20

            System.out.println();

        System.out.println("__________After Swapping_________");

        System.out.println();
        System.out.println("Value1 after Swapping : " + Value1);
        System.out.println();
        System.out.println("Value2 after Swapping : " + Value2);
        System.out.println();
        System.out.println("Value3 after Swapping : " + Value3);

    }
}
