#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<limits.h>
#include<stdbool.h>
#include<stdlib.h>
#include<math.h>
int main(){
    char str[100];
    fgets(str,sizeof(str),stdin);
    printf("%s %d\n",str,strlen(str));

    if(str[strlen(str)-1]=='\n' && strlen(str)>0){
        str[strlen(str)-1]='\0';
        printf("%s  Length is:%d\n",str,strlen(str));
    }
    return 0;
}