public class EvenNumber
{
    public static int[] countEvenNumbers(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            return new int[]{-1, -1};
        }

        int Evecount = 0;
        int Oddcount = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
                Evecount++;
            }
            else
            {
                Oddcount++;
            }
        }

        return new int[]{Evecount, Oddcount};
    }

    public static void main(String[] args)
    {
        EvenNumber obj = new EvenNumber();

        int[] nums = {3, 8, 5, 12, 7};

        int result = obj.countEvenNumbers(nums)[0] + obj.countEvenNumbers(nums)[1];

        System.out.println("Even numbers count: " + obj.countEvenNumbers(nums)[0]);
        System.out.println("Odd numbers count: " + obj.countEvenNumbers(nums)[1]);
    }
}