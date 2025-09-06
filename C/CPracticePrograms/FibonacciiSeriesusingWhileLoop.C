#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of terms of the Fibonacci series that you want to be printed:");
    scanf("%d",&n);
    printf("The Fibonacci series is : ");
    //printf("0 1 ");
    int i=1,sum=0,n1=0,n2=1;
    printf("%d %d ",n1,n2);
    while(i<=n-2){
        printf("%d ",n1+n2);
        int temp=n1;
        n1=n2;
        n2=temp+n2;
        i++;
    }
    return 0;
}