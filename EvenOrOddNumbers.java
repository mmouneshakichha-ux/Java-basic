public class EvenOrOddNumbers
{
    static void findEvenOrOddNumbers(int[] nums)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }

    public static void main(String[] args)
    {
        int[] nums = {3, 8, 5, 12, 7, 2};

        findEvenOrOddNumbers(nums);
    }
}


