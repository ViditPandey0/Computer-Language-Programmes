#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int tc,n;
    scanf("%d",&tc);
    
    for (int i=0;i<tc;i++){
        int max=0,maxlen=0,maxwidth=0;
        scanf("%d",&n);
        int l,w;
        for(int j=0;j<n;j++){
            scanf("%d%d",&l,&w);
            if (l*w>max){
                max=l*w;
                maxlen=l;
                maxwidth=w;
            } 
        }
        printf("%d %d\n",maxlen,maxwidth);
    }
    return 0;
}
