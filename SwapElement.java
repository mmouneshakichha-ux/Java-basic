public class SwapElement
{
    void swapElement(int[] nums)
    {
        if (nums == null || nums.length == 0)
        {
            return;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right)
        {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            right = right - 1;
            left = left + 1;
        }
    }

    public static void main(String[] args)
    {
        SwapElement obj = new SwapElement();

        int[] nums = {10, 20, 30, 40, 50};

        obj.swapElement(nums);

        for (int x : nums)
        {
            System.out.print(x + " ");
        }
    }
}