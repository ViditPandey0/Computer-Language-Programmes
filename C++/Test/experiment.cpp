#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>
#include<string>
using namespace std;
int fact(int n){
    if (n==0 || n==1) return 1;
    else if(n<0) {
        cout<<"Factorial of this number doesn't exist.\n";
        return -1;
    }
    return n*fact(n-1);
}
int main(){
    int x=-84;
    cout<<fact(x);
    return 0;
}