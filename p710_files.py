file = open ("data.txt", "r")
while True:
    line = file.readline()	# Get next line from file
    if not line:	# If line is empty then end of file is reached.
        break
    print(line.rstrip())
file.close()
