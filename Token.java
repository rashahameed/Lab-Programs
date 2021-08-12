import java.util.Scanner;
import java.util.StringTokenizer; 
public class Token
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Name :-"); 
        String name=sc.nextLine();
        System.out.println("Enter Date of birth(dd/mm/yyyy):-"); 
        String db=sc.next();
        Customer c=new Customer(); 
        c.read(name, db);
        c.display();
    }
}
class Customer
{
    String name; 
    String dob;
    void read(String name, String dob)
    {
        this.name = name; 
        this.dob = dob;
    }
    void display()
    {
        StringTokenizer st=new StringTokenizer(this.dob,"/"); 
        System.out.print(this.name+" "); 
        while(st.hasMoreTokens())
        {
            System.out.print(","+st.nextToken());
        }
    }
}
