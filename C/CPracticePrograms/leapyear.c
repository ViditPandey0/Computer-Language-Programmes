#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<limits.h>
#include<stdbool.h>
#include<stdlib.h>
#include<math.h>
int main(){
    int year;
    scanf("%d",&year);
    if (year%4==0 &&  year%100!=0 || year%400==0){
        printf("%d is a leap year.",year);
    }else{
        printf("%d isn't a leap year.",year);
    }
    return 0;
}