// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;


 // } Driver Code Ends


//User function Template for Java



class  Solution
{
    long maxDays(long a[], int n)
    {
        int tem= (int) a[0];
        for(int i=0;i<n;i++)
        {
            if(tem<a[i])
                tem= (int) a[i];
        }
        return tem;
        
    }
}


// { Driver Code Starts.

// Driver class
class A20 {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
             Solution ob = new  Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans = ob.maxDays(a,n);
            System.out.println(ans);
        }
    }
}



  // } Driver Code Ends