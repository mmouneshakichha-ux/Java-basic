import java.util.Arrays;

public class DailySteps
{

    public static int[] findSteps(int[] steps)
    {
        int days = 0;
        int best = steps[0];

        for (int i = 0; i < steps.length; i++)
            {
            if (steps[i] > 10000)
            {
                days++;
            }

            if (steps[i] > best)
            {
                best = steps[i];
            }
        }

        return new int[]{days, best};
    }

    public static void main(String[] args)
    {
        int[] steps = {8000, 12000, 10500, 9000, 15000};

        System.out.println(Arrays.toString(findSteps(steps)));
    }
}