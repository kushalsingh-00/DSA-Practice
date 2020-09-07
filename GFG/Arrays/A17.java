import java.util.Scanner;


public class A17 {
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
                for (int j2 = j+1; j2 < n; j2++) {
                    if(Math.abs(a[j2]-a[j])>1)
                    sum+=a[j2]-a[j];
                }
            }
            System.out.println(sum);
        }
        s.close();
    }
}
