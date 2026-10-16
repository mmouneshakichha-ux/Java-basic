public class DoubleAvarage 
{
    public static double FindAvarage(int[] nums)
{
    if(nums == null || nums.length == 0)
    {
        return -1;
    }
    int sum =0;
    double avarage =0;
    for(int index =0; index < nums.length; index++)
    {
        sum = sum+ nums[index];
    }
    avarage = sum/nums.length;
    return avarage;


    }

    }
    
