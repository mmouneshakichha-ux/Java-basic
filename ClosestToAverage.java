public class ClosestToAverage 
{

    public static int findClosest(int[] nums)
    {
        double sum = 0;

        for (int i = 0; i < nums.length; i++)
            {
            sum += nums[i];
        }

        double average = sum / nums.length;
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++)
            {
            if (Math.abs(nums[i] - average)<
                Math.abs(closest - average))
                {
                closest = nums[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2, 9, 4, 15};

        System.out.println(findClosest(nums));
    }
}