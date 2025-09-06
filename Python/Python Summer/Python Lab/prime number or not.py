n=int(input("Enter a number to check if its prime number : "))
flag=True
if (n<=1):
    print("Not a prime number")
else:
    for i in range (2,n):
        if (n%i==0):
            flag=False
            print("Not a prime number")
            break
if (flag):
    print("Prime number")