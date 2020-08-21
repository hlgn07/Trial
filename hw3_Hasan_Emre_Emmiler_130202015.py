#Hasan Emre Emmiler
#130202015
#Lec2
def readStudents(filename):
    student_entry=[]
    with open (filename,'r') as input_file:
        for line in input_file:
            line=line.strip()
            entries=line.split(';')
            student_entry.append(entries)
    return student_entry
def printStudents(studentlist):
    print('Students:')
    print('No.\tId\t\tName\t\tG\tBirthdate\tDept\tClass')
    print('==\t===\t\t======\t\t==\t=========\t=====\t=====')
    for i, student in enumerate(studentlist):
        
        print(str(i)+"\t"+student[0]+"\t"+student[1]+"\t"+student[2]+"\t"+student[3]+"\t"+student[4]+"\t"+student[5])
def printDeptStu(studentlist,dept_code):
    dept_code=input("Students in department: ")
    for student in studentlist:
        if student[4]==dept_code:
            print(student[0], student[1], student[2], student[3], student[4], student[5])

def deptCounts(studentlist):
##    dept_count={} (I wrote using  dictionary it work true.)
##    for student in studentlist:
##        department=student[4]
##        if dept_count.get(department)==None:
##            dept_count[department]=1
##        else:
##            dept_count[department]=1+dept_count.get(department)
##    return dept_count
    
    numCS=0
    numEEE=0
    numIE=0
    numCIVE=0
    numME=0
    for line in studentlist:
        if(line[4]=="CS"):
            numCS+=1
        elif(line[4]=="EEE"):
            numEEE+=1
        elif(line[4]=="IE"):
            numIE+=1
        elif(line[4]=="CIVE"):
            numCIVE+=1
        elif(line[4]=="ME"):
            numME+=1
    print("number of Students per depertments." )
    print("CS has",numCS,"students.")
    print("EEE has",numEEE,"students.")
    print("IE has",numIE,"students.")
    print("CIVE has",numCIVE,"students.")
    print("ME has",numME,"students.")
    
def incrementClass(studentlist):
    for student in studentlist:
        student[5]=str(1+int(student[5]))
    printStudents(studentlist)

def delClass5(studentlist):
    student_newlist=[]
    for student in studentlist:
        if int(student[5])<=4:
            student_newlist.append(student)
    return student_newlist

students = readStudents("data.txt")
printStudents(students)
printDeptStu(students,'CS')
print('\nPrinting students with department count')
print(deptCounts(students))
print('\nPrinting students after incrementing class by 1')
incrementClass(students)

