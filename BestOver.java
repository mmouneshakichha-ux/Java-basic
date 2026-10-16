public class BestOver
{

    public static int findBestOver(int[] runs)
    {
        int maxRuns = runs[0];
        int overNumber = 1;

        for (int i = 1; i < runs.length; i++)
            {
            if (runs[i] > maxRuns)
    {
                maxRuns = runs[i];
                overNumber = i + 1;
            }
        }

        return overNumber;
    }

    public static void main(String[] args)
    {
        int[] runs = {6, 12, 4, 15, 9};

        System.out.println(findBestOver(runs));
    }
}