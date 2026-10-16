import java.util.Arrays;

public class SumOfDigits
{

    public static int digitSum(int num)
    {
        int sum = 0;

        while (num > 0)
    {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }

        return sum;
    }

    public static int[] replaceWithDigitSum(int[] nums)
    {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
    {
            result[i] = digitSum(nums[i]);
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = {123, 45, 9};

        System.out.println(Arrays.toString(replaceWithDigitSum(nums)));
    }
}