a=[1,2,3,2,1]
b=3
c=[]
for i in range(len(a)):
    c.append(a[i]+b)
print("New array with each element incremented is",c)