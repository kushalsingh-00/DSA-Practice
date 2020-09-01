import java.util.Arrays;
import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }
            int k = s.nextInt();
            Arrays.sort(arr);

            System.out.println(arr[k - 1]);
        }
    }
}
