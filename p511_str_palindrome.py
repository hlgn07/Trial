# isPalindrome: Returns true if s is a palindrome.
def isPalindrome(s):
    s = s.upper()
    slen = len(s)
    for j in range(slen // 2 + 1):
        if s[j] != s[slen-j-1]:
            return False
    return True
# end isPalindrome
#--------------------
# MAIN Program:
print("Palindrome control:")
a = "Abba"
if isPalindrome(a):
    print (a, "is a palindrome.")
else:
    print (a, "is not a palindrome.")

b = "Abba!"
print (b, "->", isPalindrome(b))
c = "Anastas Mum Satsana"
print (c, "->", isPalindrome(c))
d = "Madam, I'm Adam!"
print (d, "->", isPalindrome(d))
