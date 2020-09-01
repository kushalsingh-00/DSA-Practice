import java.util.Arrays;
import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,k;
            n=s.nextInt();
            k=s.nextInt();
            int a[]=new int[n];
            for (int j = 0; j <n; j++) {
                a[j]=s.nextInt();
            }
            int count=0;
            Arrays.sort(a);
            
            for (int j = 0; j < n; j++) {
                if(j==0)
                {
                    if(a[j]!=a[j+1])
                        count=j;
                }
                else if(j<n-1&&j>0)
                {
                    if(a[j]!=a[j-1]&&a[j]!=a[j+1])
                        count=j;
                }
                else
                {
                    if(a[j]!=a[j-1])
                        count=j;
                }
            }
            System.out.println(a[count]);
        }
        s.close();
    }
}