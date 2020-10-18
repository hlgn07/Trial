# Format String

a = 7;  b = 88.074;  c = "E = mc2"
str = "Values are %d, %.3f\nRelativity: %s\n" % (a, b, c)
print(str)
print("==========")

t = [7, "Antalya", 1240000, 32.4]
str = "%02d : %-12s  Population: %d  Altitude: %.1f" % tuple(t)
print(str)
print("==========")

a = 7;  b = 88;  c = 222
str = "{0}++{1}++{2}".format(a, b, c)
print(str)
str2 = "{}----{}----{}".format(a, b, c)		# Starting from Python 3.1
print(str2)
print("==========")

pi = 3.14159;    e = 2.71828
line = "E = {1}, Pi = {0}\n".format(pi, e)
print(line)
print("==========")

pi = 3.14159;    r = 4
circle = "Diameter = {0}, Circumference = {1}, Area = {2}".format(2*r, 2*pi*r, pi*r**2)
print(circle)
print("==========")
