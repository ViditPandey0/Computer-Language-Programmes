#include<stdio.h>
#include<math.h>
int main(){
    printf("Enter a number to know if it's Armstrong number:");
    int num;
    scanf("%d",&num);
    int sum=0,count=0;
    int cpynum=num;
    while(num!=0){
        num=num/10;
        count++;
    }
    num=cpynum;
    while(num!=0){
        int digit=num%10;
        sum=sum+pow(digit,count);
        num=num/10;
    }

    if(cpynum==sum){
        printf("The number %d is an Armstrong number.",cpynum);
    }else{
        printf("The number %d isn't an Armstrong number.",cpynum);
    }
    return 0;
}