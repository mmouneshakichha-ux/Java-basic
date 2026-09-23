public class ForEach 
{ 
    static void traverse(int[] arr)
    {
        for (int x : arr)
    {
        System.out.print(x + ",");
    }
    }
    public static void main(String[] args)
    {
    traverse(new int[]{1, 2, 3, 4});
}
}