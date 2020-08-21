#Hasan Emre Emmiler
#130202015
#lec2
def isBinary(s):
    for i in range(0,len(s)):
        if s[i]!='0' and s[i]!='1':
            return 0
    return 1
def binDecimal(s):
    if isBinary(s)==0:
        print(s,'is not a binary')
        return -1
    num=0
    m=len(s)-1
    for i in range (0,len(s)):
        num=num+(ord(s[i])-48)*(2**m)
        m=m-1
    return num
def stringStats(s):
    myList=[0,0,0,0]
    for i in range(0,len(s)):
        if s[i]>='A' and s[i]<='Z':
            myList[0]+=1
        if s[i]>='a' and s[i]<='z':
            myList[1]+=1
        if s[i]>='0' and s[i]<='9':
            myList[2]+=1
        if s[i]==' ':
            myList[3]+=1
    return myList
def contain(str1,str2):
    m=len(str2)
    n=len(str1)
    count=0
    for i in range(0,n-m+1):
        j=0
        while j<m:
            if str1[i+j].lower()!=str2[j].lower():
                break
            j=j+1
            if j==m:
                count+=1
                
    return count

def main():
    num=input('enter a task number 1 for binary 2 for String')
    if num!='1' or num!='2':
        print("ınvalid task number")
    if num=='1':
        temp=input('enter a binary number (0 to stop:)')
        while temp !='0':
            num=binDecimal(temp)
            if num!=-1:
                print('binary(%s)=decimal(%d)'%(temp,num))
            temp=input('enter a binary number')
    if num=='2':
        str1=input('enter a first string:')
        str2=input('enter a second string')
        temp=stringStats(str1)
        print('Number of upper case letters:',temp[0])
        print('Number of lower case letters:',temp[1])
        print('Number of digit characters:',temp[2])
        print('Number of whitespace characters:',temp[3])
        print("contain st2 in str1",contain(str1,str2))
if __name__=="__main__":
    main()
    
    
