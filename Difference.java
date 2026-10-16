
public class Difference
{
    
    public static int findDifference(int[] nums)
    {
        
        int smallest = nums[0];
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++)
        {
            
            if (nums[i] < smallest)
        {
                smallest = nums[i];
            }

            if (nums[i] > largest)
                {
                largest = nums[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {
        
        int[] nums = {10, 5, 25, 8, 15};

        System.out.println(findDifference(nums));
    }
}