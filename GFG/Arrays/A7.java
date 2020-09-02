import java.util.Scanner;


public class A7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            int a[]=new int[n];
            int temp=0;
            int count=0;
            for(int j=0;j<n;j++)
            {
                a[j]=s.nextInt();
                if(a[j]>=0)
                {
                    temp++;
                }
                else if(count<temp)
                {
                    count=temp;
                    temp=0;
                }
                else
                    temp=0;
            }
            if(count<temp)
            count=temp;

            System.out.println(count);

        }
        s.close();
    }
}