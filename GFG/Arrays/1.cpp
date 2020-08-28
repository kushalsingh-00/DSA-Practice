#include <bits/stdc++.h>
using namespace std;

int main() {
	int t;
    cin>>t;
    for (int i = 0; i < t; i++)
    {
        int n,d;
        cin>>n>>d;
        int arr[n];
        for (int j = 0; j < n; j++)
        {
            cin>>arr[(j+n-d)%n];
        }

       
        for (int j = 0; j < n; j++)
        {
            cout<<arr[j]<<" ";
        }
        cout<<"\n";
    }
	return 0;
}