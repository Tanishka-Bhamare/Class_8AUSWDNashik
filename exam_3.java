class exam_3
{
    public static void main (int cost)
    {
        if (cost<=5000)
        {
            double total_discount=(cost*(10.0/100.0));
            double total_cost=(cost-total_discount);
            System.out.println ("Total Discount is "+total_discount);
            System.out.println ("Total Amount after Discount is "+total_cost);
        }
        else if (cost<10000)
        {
            double total_discount=(cost*(20.0/100.0));
            double total_cost=(cost-total_discount);
            System.out.println ("Total Discount is "+total_discount);
            System.out.println ("Total Amount after Discount is "+total_cost);
        }
        else if (cost<20000)
        {
            double total_discount=(cost*(30.0/100.0));
            double total_cost=(cost-total_discount);
            System.out.println ("Total Discount is "+total_discount);
            System.out.println ("Total Amount after Discount is "+total_cost);
        }
        else if (cost>=20000)
        {
            double total_discount=(cost*(40.0/100.0));
            double total_cost=(cost-total_discount);
            System.out.println ("Total Discount is "+total_discount);
            System.out.println ("Total Amount after Discount is "+total_cost);
        }
    }
}