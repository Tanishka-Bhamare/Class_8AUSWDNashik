class switch_shape
{
    public static void main (int n)
    {
        int l=10, b=20,s=15,z=8, h=6, p=10, q=23, r=16, ar, pr, as, ps, pt;
        switch (n)
        {
            case 1:
                ar = l * b;
                pr = 2 * (l + b);
            System.out.println ("Area of Rectangle is " + ar);
            System.out.println ("Perimeter of Rectangle is " + pr);
            break;
            case 2:
                as = s * s;
                ps = 4 * s;
            System.out.println ("Area of Square is " + as);
            System.out.println ("Perimeter of Square is " + ps);
            break;
            case 3:
                float at;
                at = (float)0.5*z*h;
                pt = (p+q+r);
            System.out.println ("Area of Triangle "+at);
            System.out.println ("Perimeter of Triangle "+pt);
            break;
            default:
                System.out.println ("Wrong choice");
        }
    }
}