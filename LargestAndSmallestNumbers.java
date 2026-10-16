public class LargestAndSmallestNumbers
{

    public static int findDifference(int[] nums) 
    {
        int largest = nums[0];
        int smallest = nums[0];

        for (int i = 1; i < nums.length; i++) 
            {
            if (nums[i] > largest) 
            {
                largest = nums[i];
            }

            if (nums[i] < smallest) 
            {
                smallest = nums[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) 
    {
        int[] nums = {14, 3, 27, 9};

        System.out.println(findDifference(nums));
    }
}