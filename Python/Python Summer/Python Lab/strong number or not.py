def fact(num):
    prdct=1
    for i in range(num,0,-1):
        prdct*=i
    return prdct
n=int(input("Enter a number to check if it's a strong number : "))
sum=0
orgnl=n
rem=0
while(orgnl):
    rem=orgnl%10
    sum+=fact(rem)
    orgnl=orgnl//10
if (sum==n):
    print("Strong number")
else:
    print("Not a strong number")