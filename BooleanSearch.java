public class BooleanSearch
{
    boolean search(int number[], int key)
    {
        if (number == null || number.length == 0)
        {
            return false;
        }

        for (int i = 0; i < number.length; i++)
        {
            if (key == number[i])
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        BooleanSearch obj = new BooleanSearch();

        int[] number = {10, 20, 30, 40, 50};
        int key = 30;

        boolean result = obj.search(number, key);

        System.out.println(result);
    }
}