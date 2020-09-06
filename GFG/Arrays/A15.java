import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=s.nextInt();
            }

            for(int j2=1;j2<=n;j2++)
            {
                int flag=0;
                for (int j = 0; j < n; j++) {
                    if(a[j]==j2)
                        flag=1;
                }
                if(flag==0)
                    System.out.print(j2+" ");
            }
            System.out.println();
        }
        s.close();
    }
}