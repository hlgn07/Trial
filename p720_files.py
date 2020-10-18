# Write a function dispfile() that takes a file name as parameter, 
# reads all lines from this file and displays them on screen and 
# returns the number of lines displayed.

def dispfile(filename):
    file = open(filename, "r")
    lines = file.readlines()
    file.close()
    for line in lines:
        print(line.rstrip())
    return len(lines)

# Main program
n = dispfile("a1.txt")
print("File has %d lines." % n)
print("====================")

# A file contains only integer and float numbers. 
# Write a function numbers() that takes a file name as parameter, 
# reads all contents of the file, computes and returns the sum of the numbers.
# Hint:	float("124") will return 124.0

def numbers(filename):
    file = open(filename, "r")
    contents = file.read()
    file.close()
    nums = contents.split()
    sum = 0
    for item in nums:
        sum += float(item)
    return sum

# Main program
sum = numbers("a2.txt")
print(sum)
print("====================")
