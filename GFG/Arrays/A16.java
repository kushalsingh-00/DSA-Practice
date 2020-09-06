import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=s.nextInt();
            }

            int sum=0;
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    if(j!=j2)
                        if(a[j]==a[j2])
                            a[j]=0;
                }

                sum+=a[j];
            }
            System.out.println(sum);
        }
        s.close();
    }
}