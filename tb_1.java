class tb_1
{
    public static void main ()
    {
        int income=410000;
        double total_tax;
        double Amt;
        total_tax=(income*(3.2/100.0));
        System.out.println ("You total tax is "+total_tax);
        Amt=total_tax+income;
        System.out.println ("Your payable amount is " +Amt);
    }
}