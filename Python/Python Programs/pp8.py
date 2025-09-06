for i in range(1,6):
    print("*",end='')
print("\n")
for i in range(1,5):
    for j in range(i):
        print("_",end='')
    for k in range(5-i,0,-1):
        print("*",end='')
    print("\n")