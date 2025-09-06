#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<limits.h>
#include<stdbool.h>
#include<stdlib.h>
#include<math.h>
int main(){
    int arr1[][3]={1,3,5
    ,7,9,11,
    13,15,17};
    int arr2[][3]={2,4,6,
    8,10,12,
    14,16,18};
    int arr3[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            int sum=0;
            for(int k=0;k<3;k++){
                sum+=arr1[i][k]*arr2[k][j];
            }
            arr3[i][j]=sum;
        }
    }
     for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            printf("%d ",arr3[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}