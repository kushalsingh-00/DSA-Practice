import java.util.Scanner;
import java.util.Arrays;

public class A5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int a[]=new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=s.nextInt();
            }
            System.out.println(numofsubset(a, n));
    }
    s.close();
    }
    private static int numofsubset(int a[], int n) {
        int count=1;
        Arrays.sort(a);
        for (int i = 1; i <n; i++) {
            if(a[i]!=a[i-1]+1)
            {
                count++;
            }
        }
        return count;
    }
}