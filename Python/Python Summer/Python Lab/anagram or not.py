s1=input("Enter first string:")
s2=input("Enter second string:")
s1=s1.lower()
s2=s2.lower()
s1=sorted(s1)
s2=sorted(s2)
if (len(s1)==len(s2)):
    if (s1==s2):
        print("Anagram")
    else:
        print("Not anagram")
else:
    print("Not anagram")