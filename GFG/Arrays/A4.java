import java.util.Scanner;

public class A4 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int t=s.nextInt();
            for(int i=0;i<t;i++)
            {
                int n=s.nextInt();
                long a[]=new long[n];
                for(int j=0;j<n;j++)
                {
                    a[j]=s.nextInt();               
                }
                int count=n;
                for(int j=0;j<n;j++)
                {
                    for(int k=0;k<j;k++)
                    {
                        if(j!=k)
                        {
                            if((Math.abs(a[j]))==Math.abs(a[k]))
                            {
                                count--;
                                break;
                            }
                        }
                    }
                }

                System.out.println(count);
            }
        }
}