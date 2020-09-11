// { Driver Code Starts
//Initial Template for Java


import java.io.*;

public class A21 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution2().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution2 {
    int findMaximum(int[] arr, int n) {
        int max;
        int i;
        if(arr[n-1]>arr[n-2])
            return arr[n-1];
        else
        {

        for(i=1;i<n;i+=2)
        {
            if(arr[i-1]<arr[i])
                continue;
            else
                break;
            
        }
        max=(arr[i-1]>arr[i-2])?arr[i-1]:arr[i-2];
        return max;
    }
    }
}