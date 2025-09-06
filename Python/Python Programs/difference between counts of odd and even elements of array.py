a=[1,2,3,4]
odd=0
even=0
for i in range(len(a)):
    if a[i]%2==0:
        even+=1
    else:
        odd+=1
if (even-odd)<0:
    print("The difference between\
 counts of odd and even elements is ",-(even-odd))
else:
    print("The difference between\
 counts of odd and even elements is",even-odd)