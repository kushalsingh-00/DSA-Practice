// { Driver Code Starts
    import java.util.*;
    
    class Height
    {
        int feet;
        int inches;
        
          public Height(int ft, int inc)
          {
               feet = ft;
               inches = inc;
          }
    }
    
    class A9
    {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                Height arr[] = new Height[n];
                for(int i = 0; i < n; i++)
                {
                    int temp1 = sc.nextInt();
                    int temp2 = sc.nextInt();
                    arr[i] = new Height(temp1, temp2);
                  
                }
                
                int res = findMax(arr, n);
                System.out.println(res);
            }
            sc.close();
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