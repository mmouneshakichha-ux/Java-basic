public class LeftToRightIndex
{
    public static int binarySearch(int[] arr, int target)
    {
        // Edge case 1: Array is null
        if (arr == null)
        {
            return -1;
        }

        // Edge case 2: Array is empty
        if (arr.length == 0)
        {
            return -1;
        }

        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex)
        {
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;

            if (arr[midIndex] == target)
            {
                return midIndex;
            }
            else if (arr[midIndex] < target)
            {
                leftIndex = midIndex + 1;
            }
            else
            {
                rightIndex = midIndex - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int result = binarySearch(arr, target);

        System.out.println("Index: " + result);
    }
}