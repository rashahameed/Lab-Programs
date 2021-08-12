import java.util.Scanner;
public class StaffMain
{
    static int n,m,o;
    static Scanner input=new Scanner(System.in); 
    public static void main(String[] args)
    {  
        System.out.println("-----Read teaching staff detail------");
        System.out.println("how many number of teaching staff:");
        m=input.nextInt(); 
        teaching[] s=new teaching[m]; //creating an instance of the class (single occurence)
        for(int i=0;i<m;i++)
        {
            s[i]=new teaching(); //new keyword says that different inputs will be assigned unique varibles.Plays a major role in creating a class instance(allocating a new obj)
            System.out.println("enter teaching staff "+(i+1)+" details"); 
            s[i].read();
        }
        System.out.println("\n-----Read technical staff detail------");
        System.out.println("how many number of technical staff:"); 
        n=input.nextInt();
        technical[] t=new technical[n]; 
        for(int i=0;i<n;i++)
        {
            t[i]=new technical(); //new obj created
            System.out.println("enter technical staff "+(i+1)+" details"); 
            t[i].read();
        }
        System.out.println("\n*------Read contractor staff detail------"); 
        System.out.println("how many number of contractor staff:"); 
        o=input.nextInt();
        contractor[] c=new contractor[o]; 
        for(int i=0;i<o;i++)
        {
            c[i]=new contractor();
            System.out.println("enter contractor staff "+(i+1)+" details"); 
            c[i].read();
        }
        System.out.println("\n-----TEACHING STAFF-----"); 
        System.out.println("SID\tNAME\tPHONE\\ttSALARY\tDOMAIN\tPUBLICATION");
        System.out.println("	");
        for(int i=0;i<m;i++)
        {
            s[i].display();
        }
        System.out.println("\n ----TECHNICAL STAFF ------"); 
        System.out.println("SID\tNAME\tPHONE\t\tSALARY\tSKILLS");
        System.out.println("	");
        for(int i=0;i<n;i++)
        {
            t[i].display();
        }
        System.out.println("\n-----CONTRACTOR STAFF-----"); 
        System.out.println("SID\tNAME\tPHONE\t\tSALARY\tPERIOD"); 
        System.out.println("	");
        for(int i=0;i<o;i++)
        {
            c[i].display();
        }
    }
}
class Staff
{
    int staffid;
    String name; 
    String phone;
    int salary;
    Scanner input=new Scanner(System.in); 
    Scanner in=new Scanner(System.in); 
    void read()
    {
       System.out.println("enter the staffid"); 
       staffid=input.nextInt(); 
       System.out.println("enter the name"); 
       name=in.nextLine(); 
       System.out.println("enter the phone"); 
       phone=in.nextLine(); 
       System.out.println("enter the salary"); 
       salary=input.nextInt();
    }
}
class teaching extends Staff
{
    String domain; 
    String publisher; 
    void read()
    {
        super.read();
        System.out.println("enter the domain");
        domain=in.nextLine(); 
        System.out.println("enter the publication"); 
        publisher=in.nextLine();
    }
    void display()
    {
        System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t"+domain+"\t"+publisher+"\t");
    }
}
class technical extends Staff
{
    int n; String[]skills;
    void read()
    {
        super.read();
        System.out.println("enter the number of skills"); 
        n=input.nextInt();
        skills=new String[n]; 
        for(int i=0;i<n;i++)
        {
            System.out.println("enter skills" +(i+1)); 
            skills[i]=input.next();
        }
    }
    void display()
    {
        System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t");
        for(int j=0;j<skills.length;j++)
        {
            System.out.print(skills[j]+",");
        }
        System.out.print("\n");
    }
}
class contractor extends Staff
{
    int period; 
    void read()
    {
        super.read();
        System.out.println("how many years of contract"); 
        period=input.nextInt();
    }
    void display()
    {
        System.out.println(staffid+"\t"+name+"\t"+phone+"\t"+salary+"\t"+period+"\t");
    }
}
