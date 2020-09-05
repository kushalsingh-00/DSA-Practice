import java.util.Scanner;

public class A8 {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
           int t=s.nextInt();
           for (int i = 0; i < t; i++) {
               int n=s.nextInt();
               long a[]=new long[n];
               for (int j = 0; j < n; j++) {
                   a[j]=s.nextLong();
               }
   
               long sum=0;
               for(int j=0;j<n-1;j++)
               {
                   long temp=a[j]+a[j+1];
                   if(sum<temp)
                       sum=temp;
               }
   
               System.out.println(sum);
           }
           s.close();
       }
}
