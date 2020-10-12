from collections import defaultdict

s = input()
s = s.replace('.', '')
s = s.replace(',', '')
s = s.replace(';', '')

l = s.split(' ')

d = defaultdict(int)
f = defaultdict(str)

for t in l:
    if d[t.lower()] == 0:
        f[t.lower()] = t
    d[t.lower()] += 1

t = defaultdict(list)
for k in d:
    t[d[k]].append(f[k])

m = max(t.keys())
print(sorted(t[m])[0], m)
