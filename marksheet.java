class marksheet
{
    public static void main(int E,int M, int Comp, int P, int Chem, int B)
    {
        int total;
        double per;
        total=E+M+Comp+P+Chem+B;
        per=(total*100)/600;
        System.out.println("English"+E);
        System.out.println("Maths"+M);
        System.out.println("Computer"+Comp);
        System.out.println("Physics"+P);
        System.out.println("Chemistry"+Chem);
        System.out.println("Biology"+B);
        System.out.println("Total"+total);
        System.out.println("Percentage"+per);
    }
}
        