#include<stdio.h>
#include<limits.h>
#include<math.h>
#include<string.h>
#include<ctype.h>
#include<stdbool.h>
int main(){
    int num=9;
    for(;num<19; (num>8)? num+=2:num++){
        printf("%d\n",num);
    }
    return 0;
}