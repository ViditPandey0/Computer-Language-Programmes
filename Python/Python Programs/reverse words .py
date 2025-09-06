a="Everyone loves data science"
words=a.split()
reversed_words=[word[::-1] for word in words]
print(reversed_words)
result=' '.join(reversed_words)
print(result)