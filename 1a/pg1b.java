import java.util.Scanner;
public class pg1b
{
    static int top=-1,max=5; //class variable (since applicable to all methods)
    static int a[] = new int[5];
    static Scanner sc =new Scanner(System.in);
    static void push()  //static reference to static method 
    {
        int ele;
        if(top==max-1)
        {
            System.out.println("Stack Full");
        }
        else
        {
            System.out.println("Enter the element to be inserted");
            ele = sc.nextInt();
            a[++top]=ele;
        }
    }
    static void pop()
    {
        int ele;
        if(top == -1)
        {
            System.out.println("Stack Empty!");
        }
        else
        {
            ele=a[top--];
            System.out.println(ele + " is removed from the stack");
        }
    }
    static void display()
    {
        int i;
        System.out.println("Array Elements are"+"\n");
        for(i=top;i>=0;i--)
        {
            System.out.println(a[i]+"\n");
        }
    }
    public static void main(String[] args)
    {
        int ch;
        do
        {
            System.out.println(".....Menu....."+"\n"+"1.Push"+"\n"+"2.Pop"+"\n"+"3.Display"+"\n"+"4.Exit");
            System.out.println("Enter Choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: push(); break;
                case 2: pop(); break;
                case 3: display();break;
                case 4: System.exit(0);
                default: System.out.println("Invalid Choice!");
            }
        }while(ch>=1 && ch<=4);
    }
}