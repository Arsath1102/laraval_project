string="mohamedArsath"
freq={}
for char in string:
    if char in freq:
        freq[char] +=1
    else:
         freq[char]=1
print(freq)
least_freq=[]
for i in freq:
    if freq[i]==1:
        least_freq.append(i)
print(least_freq)          
