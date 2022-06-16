class tb_3
{
    public static void main ()
    {
        int i=10;
        int sum=0;
        do
        {
            sum= i+sum;
            i--;
        }
            while (i>=1);
            System.out.println ("The sum is "+sum);
    }
}