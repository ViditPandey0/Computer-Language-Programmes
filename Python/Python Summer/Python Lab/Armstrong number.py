n=int(input("Enter the three digit number to check if it's armstrong : "))
orgnl=n
count=0
sum=0
digit=0
while(n):
    n=n//10
    count+=1
n=orgnl
while(n):
    digit=n%10
    sum+=digit**count
    n//=10
if (sum==orgnl):
    print("Armstrong Number")
else:
    print("Not an armstrong number")