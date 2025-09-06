n=int(input("Enter a number : "))
orgnl=n
sum=0
rem=0
while(n):
    rem=n%10
    sum+=rem**3
    n=n//10
if (sum==orgnl):
    print("Armstrong number")
else:
    print("Not an armstrong number")