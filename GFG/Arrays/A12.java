import java.util.Scanner;

public class A12 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            for (int i = 0; i < t; i++) {
                int a[]=new int[10];
                for (int j = 0; j < 10; j++) {
                    a[j]=s.nextInt();
                }

                if(a[5]==a[4]||a[5]==a[6])
                    System.out.println(a[5]);
                else
                    System.out.println(a[6]);
            }
            s.close();
        }
}
