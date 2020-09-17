// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;



 // } Driver Code Ends


//User function Template for Java



class sA22
{
    long calculateMaxSumLength(long arr[], int N,int K)
    {
        int sum=0;
        int a=0;
        int b=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]>K)
            {
                b=i;
                boolean temp=false;
                for(int j=a;j<b;j++)
                {
                    if(arr[j]==K)
                    {
                        temp=true;
                        break;
                    }
                }

                if(temp)
                {
                    for(int j1=a;j1<b;j1++)
                    {
                        sum++;
                    }
                }

                a=i+1;
            }

            else if(i==N-1)
            {
                boolean temp=false;
                for(int j=a;j<N;j++)
                {
                    if(arr[j]==K)
                    {
                        temp=true;
                        break;
                    }
                }

                if(temp)
                {
                    for(int j=a;j<N;j++)
                    {
                        sum++;
                    }
                }
            }
        }
        return sum;
    }
}

// { Driver Code Starts.

// Driver class
class A22 {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[m];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            int k = Integer.parseInt(br.readLine());
            sA22 ob = new sA22();
            long ans=ob.calculateMaxSumLength(a,n,k);
            System.out.println(ans);
        }
    }
}



  // } Driver Code Ends