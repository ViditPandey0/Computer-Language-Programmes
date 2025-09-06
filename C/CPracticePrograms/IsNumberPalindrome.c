#include<stdio.h>
#include<math.h>
int main(){
    printf("Enter a number to know if it's Palindrome number:");
    int num;
    scanf("%d",&num);
    int newnum=0,count=0;
    int cpynum=num;
    while(num!=0){
        num=num/10;
        count++;
    }
    num=cpynum;
    while(num!=0){
        int digit=num%10;
        newnum=digit*pow(10,count-1)+newnum;
        count--;
        num=num/10;
    }

    if(newnum==cpynum){
        printf("The number %d is a Palindrome number.",cpynum);
    }else{
        printf("The number %d isn't a Palindrome number.",cpynum);
    }
    return 0;
}