import java.util.Scanner; 
public class warshall
{
    void warsh(int[][] w,int n)
    {
        int i,j,k; 
        for(k=1;k<=n;k++)
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    w[i][j]=(w[i][j] | (w[i][k] & w[k][j]));
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int a[][]=new int[10][10]; 
        int n,i,j;
        System.out.println("enter the number of vertices"); 
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();
        System.out.println("Enter the binary matrix"); 
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                a[i][j]=sc.nextInt(); 
            }
        }
        warshall f=new warshall(); 
        f.warsh(a, n);
        System.out.println("The Transitive Clossure Matrix: "); 
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}

