# TUPLES
print("TUPLES")

# Creating tuples:
t = ()			# Empty tuple
print(t)
tup1 = ('physics', 'chemistry', 1997, 2000)
print(tup1)
tup2 = (1, 2, 3, 4, 5)
print(tup2)
tup3 = "a", "b", "c", "d"	# without paranthesis
print(tup3)
print("==========")

a = 7
b = 12
c = (a, b)
print(c)
print("==========")

# Accessing Values in Tuples:
p10 = (2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
print(p10[0], p10[7])
x = p10[3] * p10[6]
print(x)
print("==========")

# Tuples are immutable.
# tup1[0] = 100		# This action is not valid for tuples
# However, the objects inside tuples can be modified.
life = (['Canada', 76.5], ['United States', 75.5], ['Mexico', 72.0])
print(life)
life[0][1] = 80.0
print(life)
print("==========")
tup1 = (12, 34.56, 7, 89.01)
print(tup1)
tup2 = ('abc', "d", "ef", "klm-opq", 'xyz')
print(tup2)
# A new tuple can be created as follows:
tup1 = tup1 + tup2	# a new tuple is created, then assigned to tup1
print(tup1)
print("==========")

# Slicing tuples:
tup1 = (12, 34.56, 7, 89.01)
tup2 = ('abc', "d", "ef", "klm-opq", 'xyz')
# New tuples can be created as follows:
tup3 = tup1 + tup2
print(tup3)
tup4 = tup1[2:] + tup2[0:3]
print(tup1[2:])			# elements with index 2 to end.
print(tup2[0:3])		# elements with index 0 to 2.
print(tup4)
print("==========")
