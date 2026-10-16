public class DivisibleByThreeAndFive 
{

    public static int countNumbers(int[] nums)
    {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 3 == 0 && nums[i] % 5 == 0)
        {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] nums = {15, 9, 30, 10, 45, 7};

        System.out.println(countNumbers(nums));
    }
}