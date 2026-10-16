import java.util.Arrays;

public class FilterNumbers {

    public static int[] findNumbers(int[] nums)
    {
        return Arrays.stream(nums)
                    .filter(n -> n > 50 && n < 100)
                    .toArray();
    }

    public static void main(String[] args) {
        int[] nums = {45, 67, 100, 52, 99, 120, 50};

        int[] result = findNumbers(nums);

        System.out.println(Arrays.toString(result));
    }
}