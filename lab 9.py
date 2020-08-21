def squares(num):
    result = {}
    for i in range(1, num + 1):
        result[i] = i*i
    return result

def createFrequency(sentence):
    result = {}
    for w in sentence.split():
        x = result.get(w, 0)
        result[w] = 1 + x
    return result


print(squares(10))
print(createFrequency('rick and morty and all other TV series and best'))


def decodeString(str):
    str1=""
    answers = {"A": "E", "B": "X", "F": "D", "K": "L", "S": "M"}
    str=list(str)
    print(str)

    for k in str:
        if(k in answers):
            print(k)
            str1 += (list(answers.values())[list(answers.keys()).index(k)])

        else:
            str1+="?"



    print(str1)
answers={"A":"E","B":"X","F":"D","K":"L","S":"M"}
str="ABCSF"
decodeString(str)

def myFuncDıc(str):
    my_dict = {}
    for letter in str:

        if(letter.isalpha()):
            my_dict[letter] = my_dict.get(letter, 0) + 1


    print(my_dict)


str="ABU_School_Class"


myFuncDıc(str)
def removeminValue(d):
    m = d[list(d)[0]]
    print(m)
    for k,v in d.items():
        if(v<m):
            v=m

    s=(list(d.keys())[list(d.values()).index(m)])
    d.pop(s)
    return d

m = {'A': 1, 'B': 2, 'C': 3, 'D': 4}

removeminValue(m)

print(m)



