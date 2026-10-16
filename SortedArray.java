import java.util.Arrays;

public class SortedArray
{
    public static int[] sortedArray(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int key = array[i];
            int preIndex = i - 1;

            while (preIndex >= 0 && array[preIndex] > key)
            {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }

            array[preIndex + 1] = key;
        }

        return array;
    }

    public static void main(String[] args)
    {
        int[] array = {8,7,6,5,4};

        int[] result = sortedArray(array);

        System.out.println(Arrays.toString(result));
    }
}