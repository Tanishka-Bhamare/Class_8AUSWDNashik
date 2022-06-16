class if_else_operator
{
    public static void main (int n)
    {
        int a = 10;
        int b = 20;
        int c;
        if (n == 1)
        {
           c = a + b;
           System.out.println("addition is " + c);
        }
        else if (n == 2)
        {
            c = a - b;
            System.out.println("Substraction is " + c);
        }
        else if (n == 3) 
        {
            c = a * b;
            System.out.println("Multiplication is " + c);
        }
        else if (n == 4)
        {
            c = a / b;
            System.out.println("Division is " + c);
        }
        else 
        {
            System.out.println("Invalid Choice");
        }
    }
}