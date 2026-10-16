public class PassedStudents 
{

    public static int countPassed(int[] marks) 
    {
        int count = 0;

        for (int i = 0; i < marks.length; i++) 
    {
            if (marks[i] >= 35) 
    {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] marks = {40, 22, 35, 90, 18};

        System.out.println(countPassed(marks));
    }
}