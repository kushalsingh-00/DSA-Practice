import java.util.Scanner;

class Height {
    int feet;
    int inches;

    public Height(int ft, int inc) {
        feet = ft;
        inches = inc;
    }
}

public class A9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Height arr[] = new Height[n];
            for (int j = 0; j < n; j++) {
                arr[j]=new Height(s.nextInt(), s.nextInt());
            }

            int r = findMax(arr, n);
            System.out.println(r);
        }
        s.close();
    }

    public static int findMax(Height arr[], int n)
    {
        int sum=0;
        for (int j = 0; j < n; j++) {
            int temp=arr[j].feet*12+arr[j].inches;
            if(sum<temp)
                sum=temp;
        }
        return sum;
    }
}
