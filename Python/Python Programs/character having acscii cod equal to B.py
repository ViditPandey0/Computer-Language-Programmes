a = "aabbcc"
B = 98

index = a.find(chr(B))
print(index if index != -1 else -1)
'''a="aabbcc"
B=98
found=False
for idx,ch in enumerate(a):
    if ord(ch)==B:
        print(idx)
        found=True
        break

if not found:
    print(-1)'''