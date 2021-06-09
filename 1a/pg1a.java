import java.util.Scanner;
public class pg1a
{
    static int n,i;
    static String[] usn = new String[10];
    static String[] name = new String[10];
    static String[] branch = new String[10];
    static Long[] ph = new Long[10];
    static Scanner sc = new Scanner(System.in);
    static void read()
    {
        for(i=0;i<n;i++)
        {
            System.out.println("Student"+(i+1));
            System.out.println("USN: ");
            usn[i] = sc.next();
            System.out.println("Name: ");
            name[i] = sc.next();
            System.out.println("Branch: ");
            branch[i] = sc.next();
            System.out.println("Phone No.: ");
            ph[i] = sc.nextLong();        
        }
    }
    static void display()
    {
        System.out.println("USN "+"\t"+"Name "+"\t"+"Branch "+"\t"+"Phone No.");
        for(i=0;i<n;i++)
        {
            System.out.println(usn[i]+"\t"+name[i]+"\t"+branch[i]+"\t"+ph[i]);
        }        
    }
	public static void main(String[] args) 
	{
	System.out.println("Enter the Number of Students: ");        
        n = sc.nextInt();
        read();
        System.out.println("Student Details");
        display();
	}
}
