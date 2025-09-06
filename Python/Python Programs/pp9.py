for i in range(1,11):
    print("*",end='')
print("\n")
for i in range(1,5):
    for j in range(5-i,0,-1):
        print("*",end='')
    for k in range(2*i):
        print(" ",end='')
    for l in range(5-i,0,-1):
        print("*",end='')
    print("\n")