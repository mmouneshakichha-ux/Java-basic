public class PalindromeCount
{

    public static boolean isPalindrome(int num)
    {
        int original = num;
        int reverse = 0;

        while (num > 0)
    {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
        }

        return original == reverse;
    }

    public static int countPalindromes(int[] nums)
    {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
    {
            if (isPalindrome(nums[i]))
    {
                count++;
    }
    }

        return count;
    }

    public static void main(String[] args)
    {
        int[] nums = {121, 45, 7, 1331, 80};

        System.out.println(countPalindromes(nums));
    }
}