class First
{
    public static void Pro1(int num [])
    {
        for(int i=0; i<num.length-1; i++)
    {
        int minIndex = i;
        for(int j=i+1; j<num.length; j++)
        {
            if(num[j]<num[minIndex])
        {
            minIndex = j;
        }
        }

            int temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;
        }


            for(int i=0; i<num.length; i++)
            {
                if(i>0)
            {
                System.out.print(" ");


                }
                System.out.print(num[i]);

            }
        }

        public static void main(String[]args)
        {
            int num[] = {9,2,16,6,13};
            Pro1(num);
        }
    }

