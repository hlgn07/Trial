# removeNonAlnum:
def removeNonAlnum(s):
    s2 = ""
    for j in range(len(s)):
        if s[j].isalnum():
            s2 += s[j]
    return s2
# end removeNonAlnum
#--------------------
# isPalindrome: Returns true if s is a palindrome.
def isPalindrome(s):
    s = removeNonAlnum(s)
    s = s.upper()
    if s == s[::-1]:
        return True
    else:
        return False
# end isPalindrome
#--------------------
# MAIN Program:
print("Palindrome control:")
a = "Abba"
if isPalindrome(a):
    print(a, "is a palindrome.")
else:
    print(a, "is not a palindrome.")
b = "Abracadabra!"
print(b, "->", isPalindrome(b))
c = "Anastas Mum Satsana..."
print(c, "->", isPalindrome(c))
d = "Madam, I'm Adam!"
print(d, "=>", removeNonAlnum(d))
print(d, "->", isPalindrome(d))
