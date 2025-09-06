s="aeiouAEIOU"
s2=input("Enter any string : ")
count=0
for i in range (len(s2)):
    if (s2[i] in s):
        count+=1
print("The number of vowels in the input string is",count)