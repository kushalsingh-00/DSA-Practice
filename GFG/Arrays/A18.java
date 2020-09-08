import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=s.nextInt();
            }
            
            for (int j = 0; j < n; j++) {
                int max=0;
                if(j==n-1)
                    max=-1;
                else
                for (int j2 = j+1; j2 < n; j2++) {
                    if(a[j2]>max)
                    max=a[j2];
                }
                a[j]=max;
                System.out.print(a[j]+" ");
            }
            System.out.println();
            
        }
        s.close();
    }
}
