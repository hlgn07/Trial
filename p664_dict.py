# Use dictionary as counter:

names = ["Raquel", "Kemal", "Ali", "Raquel", "Raquel", "Jane", "Jane", "Kemal", "Jane", "Ali", "Ali", "Raquel", "Jane", "Kemal", "Raquel", "Jane", "Ali", "Raquel", "Raquel", "Ali"]
counts = {}		# Create an empty dictionary
for name in names:
    if name in counts:		# if name exists in counts,
        counts[name] += 1	# then increment that counter,
    else:			# if name doesn't exists in counts,
        counts[name] = 1	# then add new element to counts.
print(counts)		# print the dictionary
print("Name counts:")
for name in counts:
    print("%-12s :%3d" % (name, counts[name]))

print("==========")
#---------------------------------------
# Sort the counts dictionary by key:
keys = sorted(counts.keys())		# keys in order.
counts2 = {}		# new dictionary.
for k in keys:		# since keys is in order,
    counts2[k] = counts[k]		# counts2 will be ordered.
print(counts2)
print("Name counts (in name order):")
for name in counts2:
    print("%-12s :%3d" % (name, counts2[name]))
print("==========")
#---------------------------------------
# A more efficient method:
cnt = {}		# Create an empty dictionary
for name in names:
    cnt[name] = cnt.get(name, 0) + 1
print(cnt)		# print the dictionary
print("Name counts:")
for name in cnt:
    print("%-12s :%3d" % (name, cnt[name]))
