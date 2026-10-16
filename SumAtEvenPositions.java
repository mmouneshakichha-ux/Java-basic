public class SumAtEvenPositions 
{

    public static int findSum(int[] nums) 
    {
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) 
        {
            sum = sum + nums[i];
        }

        return sum;
    }

    public static void main(String[] args) 
    {
        int[] nums = {10, 3, 20, 7, 30};

        System.out.println(findSum(nums));
    }
}