result=0
def add(*args):
    for vals in args:
        result= result +vals
        return result
result = add(10,20,40) #Keyword arguments
print(result)