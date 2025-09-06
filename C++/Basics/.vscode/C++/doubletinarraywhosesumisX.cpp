#include <iostream>
#include <stdio.h>
using namespace std;
int main() {
    int x=7,i=0,n;
    int arr[]={1,2,3,4,7,15,16,18,19,20};
    n=sizeof(arr)/sizeof(arr[0]);
    int sum=0;
    while(i<n){
        if(arr[i]>9){
            int real =arr[i];
            while(arr[i]>0){
                int rem=arr[i]%10;
                arr[i]=arr[i]/10;
                sum+=rem;
                if (sum==x){
                    cout<<real<<endl;
                    break;
                }
            }
        }
        i++;
    }
    return 0;
}
