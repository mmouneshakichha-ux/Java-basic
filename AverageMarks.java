public class AverageMarks
{
        static double findAverage(int[] marks)
    {
        int sum = 0;
        for (int mark : marks)
    {
        sum = sum + mark;
    }
        return (double) sum / marks.length;
    }
        public static  void main(String[] args)
        {
            int[] marks = {70,85,90,55};
            double average = findAverage(marks);

            System.out.println("Average mark: " + average);

        }



    }
    

