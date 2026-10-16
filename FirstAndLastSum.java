public class FirstAndLastSum
{

    public static int findSum(int[] nums)
    {
        return nums[0] + nums[nums.length - 1];
    }

    public static void main(String[] args)
    {
        int[] nums = {7, 3, 9, 4};

        System.out.println(findSum(nums));
    }
}