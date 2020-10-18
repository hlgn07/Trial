# listFind: returns the index of 1st occurence of val in list 
#	if val exists in the list.  Returns -1 if not found.
def listFind(list1, val):
    if val in list1:		# If val exists in list1,
        return list1.index(val)		# return index.
    else:			# If val do not exist in list1,
        return -1			# return -1
# end listFind.

# MAIN PROGRAM:
alist = [4, 5, 2, 6, 4, 7, 1, 4, 3, 2, 7, 9, 8, 7, 4, 2, 1]
print(alist)
ind = listFind(alist, 7)
print("Index of %d in list is %d" % (7, ind))
cnt = alist.count(7)
print("%d exists in list %d times." % (7, cnt))

print("==========")
