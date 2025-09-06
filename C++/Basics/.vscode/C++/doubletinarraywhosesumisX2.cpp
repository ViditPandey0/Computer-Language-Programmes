#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    int arr[]={2,4,6,8,10,16,20,24,27};
    int target=7;
    for(int i=0;i<9;i++){
        int sum=0;
        int real=arr[i];
        while(arr[i]){
            int rem=arr[i]%10;
            sum+=rem;
            if (sum==target){
                cout<<real;
                break;
            }
            arr[i]=arr[i]/10;
        }
    }
    return 0;
}