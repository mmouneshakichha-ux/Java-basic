public class IncreasingOrder
{

    public static boolean isIncreasing(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
            {
            if (nums[i] <= nums[i - 1])
                {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[] nums = {2, 5, 9, 14};

        System.out.println(isIncreasing(nums));
    }
}