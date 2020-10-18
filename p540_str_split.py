print("String split method examples:")
print("=============================")

text = '    Python,    for 212 CS101 students...      and all    '
print(text)
print(text.split())		# Splits at space
print("----------")

text = 'Python , for ,all, and, all,olk juh'
print(text)
print(text.split(', '))		# Splits at ', '
print("----------")

text = 'Python;   for; all well  ;  and   ;all'
print(text)
ll = text.split(';')		# Splitting at ';'
print(ll)
for j in range(len(ll)):
    ll[j] = ll[j].strip()
print(ll)		# Splitting at ';'
for j in range(len(ll)):
    if len(ll[j]) > 4:
        ll[j] = len(ll[j])
print(ll)		# Splitting at ';'
print("----------")

text = "Eda Bilgin\t1987\tAnkara\tBilkent University"
print(text)
print(text.split('\t'))		# Splitting at tab '\t'
print("----------")

text = 'CatBatSatFatOr'
print(text)
# Splitting at every 3 chars
print([text[i:i+3] for i in range(0, len(text), 3)])
print("----------")

