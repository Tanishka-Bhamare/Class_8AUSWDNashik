class exam_2
{
    public static void main (int bill)
    {
        if (bill<20000)
        {
            double total_bill=bill-(bill*(5.0/100.0));
            System.out.println ("Your Total Bill is "+ total_bill);
            System.out.println ("Assured gift won is Wall Clock");
        }
        else if (bill<=50000)
        {
            double total_bill=bill-(bill*(10.0/100.0));
            System.out.println ("Your Total Bill is "+ total_bill);
            System.out.println ("Assured gift won is School bag");
        }
        else if (bill>50000)
        {
            double total_bill=bill-(bill*(15.0/100.0));
            System.out.println ("Your Total Bill is "+ total_bill);
            System.out.println ("Assured gift won is Wrist watch");
        }
    }
}