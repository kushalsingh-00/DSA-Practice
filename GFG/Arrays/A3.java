import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n;
            n=s.nextInt();
            int a[]=new int[n];
            for (int j = 1; j <= n; j++) {
                a[s.nextInt()-1]=j;
            }
            for (int j : a) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        s.close();
    }
}