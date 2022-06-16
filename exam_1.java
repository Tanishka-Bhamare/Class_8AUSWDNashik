class exam_1
{
    public static void main (int per)
    {
        if (per>=90 && per<=100)
        {
            System.out.println ("Your grade is A");
        }
        else if (per>=75 && per<90)
        {
            System.out.println ("Your Grade is B");
        }
        else if (per>=60 && per<60)
        {
            System.out.println ("Your Grade is C");
        }
        else if (per<60 && per>=1)
        {
            System.out.println ("Your Grade is D");
        }
        else
        {
            System.out.println ("Invalid Information");
        }
    }
}