priceStock={"banana":[2,2],"apple":[1.5,2.5],"orange":[3,4],"pear":[4,5]}
for a,b in priceStock.keys() and priceStock.items():
    print("name:",a,"price:",b[0],"Stocks:",b[1])
fruit=0
total=0
for k in priceStock.values():
    fruit=k[0]*k[1]
    total+=k[0]*k[1]
    print("total is:",fruit)
print("Tatal price is:",total)

def digit_sum(num):

    if num == 0:

        return 0

    else:
    #recursive call to function
        return (num%10) + digit_sum(num//10)

#call the function

print(digit_sum(856))

def harmonic_sum(n):

    if(n==0):

        return 0

    else:

        return 1/n+harmonic_sum(n-1)


print(harmonic_sum(7))

def sum_series(n):
    if n <= 1:
        return n
    else:
        return n + sum_series(n-2)

n=int(input("Enter value of n: "))
print(sum_series(n))
