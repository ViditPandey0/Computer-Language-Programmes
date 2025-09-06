def add(x,y,z=100): #Default arguments
    print(x+y)
    return x+y
result = add(y=10,z=20,x=40)  
print(result)