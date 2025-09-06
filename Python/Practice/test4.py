words=eval(input("Enter sentence :"))
splitwords=words.split()
rev_word=[word[::-1] for word in splitwords ]
sent=" ".join(rev_word)
print(sent)