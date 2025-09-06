#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
int main(){
    char str[100]= "RRR0";
    int l=strlen(str);
    char str2[l];
    strcpy(str2,str);
    strrev(str2);
    if(strcmp(str2,str)==0){
        printf("String is a palindrome.");
    }else{
        printf("String isn't a palindrome.");
    }
    return 0;
}