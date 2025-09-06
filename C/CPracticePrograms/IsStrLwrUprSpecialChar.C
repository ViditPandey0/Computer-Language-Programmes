#include<stdio.h>
#include<ctype.h>
#include<string.h>
#include<stdlib.h>
int main(){
    char str[1000];
    printf("Enter string:");
    scanf("%[^\n]s",&str);
    
    return 0;
}