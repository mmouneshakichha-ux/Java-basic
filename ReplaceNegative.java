import java.util.Arrays;

public class ReplaceNegative
{

    public static int[] replaceNegatives(int[] nums)
    {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
            {
            if (nums[i] < 0)
            {
                result[i] = 0;
            }
            else
            {
                result[i] = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] nums = {5, -3, 8, -1, 0};

        System.out.println(Arrays.toString(replaceNegatives(nums)));
    }
}