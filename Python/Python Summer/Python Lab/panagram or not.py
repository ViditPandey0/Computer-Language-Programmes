s=input("Enter string : ").lower()
str="abcdefghijklmnopqrstuvwxyz"
found=True
for i in str:
    if i not in s:
        found =False
        break
if (found):
    print("The sentence is a panagram")
else:
    print("The sentence is not a panagram")