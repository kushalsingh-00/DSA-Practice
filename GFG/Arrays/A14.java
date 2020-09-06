import java.util.Scanner;

public class A14 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            for (int i = 0; i < t; i++) {
                int n=s.nextInt();
                int a[]=new int[n];
                for(int j=0;j<n;j++)
                {
                    a[j]=s.nextInt();
                }

                int a2[]=new int[n];
                
                for (int j = 0; j < n-1; j++) {
                    a2[j]=a[j]^a[j+1];
                }
                a2[n-1]=a[n-1];
                for(int j=0;j<n;j++)
                {
                    System.out.print(a2[j]+" ");
                }
                System.out.println();
            }
            s.close();
        }
}
