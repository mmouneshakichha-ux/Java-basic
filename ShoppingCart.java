public class ShoppingCart
{

    public static double amountToPay(int[] prices)
    {
        int total = 0;

        for (int i = 0; i < prices.length; i++)
        {
            total += prices[i];
        }

        if (total > 1000)
            {
            return total - (total * 0.10);
        }

        return total;
    }

    public static void main(String[] args)
    {
        int[] prices = {400, 350, 450};

        System.out.println(amountToPay(prices));
    }
}