import java.util.Arrays;
import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt(), m = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < m; j++) {
                int a, b, k;
                a = s.nextInt();
                b = s.nextInt();
                k = s.nextInt();
                for (int k2 = a; k2 <= b; k2++) {
                    arr[k2] = arr[k2] + k;
                }
            }

            Arrays.sort(arr);
            System.out.println(arr[n-1]);
        }
        s.close();
    }
}