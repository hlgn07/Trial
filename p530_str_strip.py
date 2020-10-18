print("String strip method examples:")
print("=============================")

text = '    Python for   all and    all    '
print("<%s>" % text)
print("<%s>" % text.strip())		# strip whitespaces
print("----------")

text = 'Python for all and all...    '
print("<%s>" % text)
print("<%s>" % text.strip(' .'))	# strips spaces and dots.
print("----------")

text = 'Python for all and all...    '
print("<%s>" % text)
print("<%s>" % text.strip(' .Pal'))	# strips " .Pal" chars
print("----------")

