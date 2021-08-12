import java.util.Scanner;
public class Excep
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a :-");
        int a = in.nextInt();
        System.out.print("Enter b:-");
        int b = in.nextInt();
        Compute compute = new Compute(a, b);
        compute.compute_a_by_b();
    }
}
class Compute
{
    private int a,b;
    public Compute(int m, int n)
    {
        a = m;
        b = n;
    }
    public void compute_a_by_b()
    {
        try
        {
            if (b != 0)
            {
                System.out.println("Result a/b="+(float)1.0*a/b);
            }
            else throw new ArithmeticException("Denominator is 0! Division by zero ERROR");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error !!!!: " + e);
        }
    }
}