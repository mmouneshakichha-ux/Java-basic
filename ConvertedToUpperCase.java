import java.util.Arrays;

public class ConvertedToUpperCase
{
    public static char[] convertedToUpperCase(char[] arr)
    {
        char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 'a' && arr[i] <= 'z')
            {
                result[i] = (char)(arr[i] - 32);
            }
            else
            {
                result[i] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        char[] array = {'c', 'o', 'd', 'e'};

        char[] result = convertedToUpperCase(array);

        System.out.println(Arrays.toString(result));
    }
}