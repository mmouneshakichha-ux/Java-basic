public class Search
{
    static boolean search(int[] arr, int key)
    {
        for(int x : arr)
        {
            if(x == key)
            {
                return true;
                
            }
        }
        return false;

        

    }
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40};

        boolean result = search(arr, 40);
        System.out.println(result);

    }
    
    
}
