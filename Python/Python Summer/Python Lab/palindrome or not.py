a=int(input("Enter a number to check if it's palindrome : "))
b=0
rem=0
orgnl=a
while(a):
    rem=a%10
    b=b*10+rem
    a=a//10
if (orgnl==b):
    print("Palindrome")
else:
    print("Not a palindrome number")