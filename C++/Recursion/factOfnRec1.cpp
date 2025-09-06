#include<iostream>
#include<vector>
#include<string>
#include<climits>
#include<math.h>
using namespace std;
int power(int a,int b){
    if(b==1) return a;
    else if(b==0) return 1;
    else return a*power(a,b-1);
}
int main(){
    int a;
    cout<<"Enter base : ";
    cin>>a;
    int b;
    cout<<"Enter enxponent : ";
    cin>>b;
    cout<<power(a,b);
    return 0;
}