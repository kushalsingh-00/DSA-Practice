import java.util.Scanner;

public class A1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++)
    {
        int n=s.nextInt();
        int d=s.nextInt();
        int arr[]=new int[n];
        for (int j = 0; j < n; j++)
        {
            arr[(j+n-d)%n]=s.nextInt();
        }

       
        for (int j = 0; j < n; j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    }
}