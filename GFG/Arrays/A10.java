import java.util.Arrays;
import java.util.Scanner;

public class A10 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            for (int i = 0; i < t; i++) {
                int n=s.nextInt();
                int a[]=new int[n];
                for (int j = 0; j < n; j++) {
                    a[j]=s.nextInt();
                }

                Arrays.sort(a);

                System.out.println(a[0]);
            }
        }
}
