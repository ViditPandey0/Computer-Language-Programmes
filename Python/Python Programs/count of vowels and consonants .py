T=int(input())
for _ in range (T):
    S=input().strip()
    vowels=0
    consonants=0
    for ch in S:
        if ch.isalpha():
            if ch.lower() in 'aeiou':
                vowels+=1
            else:
                consonants+=1
    print(vowels,consonants)