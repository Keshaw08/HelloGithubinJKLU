'''Write PYTHON program, which will print those numbers whose last digit is between 5 and 9. e.g. 5, 6, 7, 8, 15, 16, 17, 18, 25, 26, ….'''

n = int(input("Tell me a no. = "))
z = n%10
if (5<= z <= 9):
    print(z)

'''Write a python program to read three numbers (a,b,c,d) and check how many numbers between ‘a’ and ‘b’ are divisible by both ‘c’ and ‘d’.'''

a = int(input("a = "))
b = int(input("b = "))
c = int(input("c = "))
d = int(input("d = "))

for i in range(a, b):
    z = (int(i/c) and int(i/d))
    
    print("divisible by c and d are  " + str(i) + "->" + str(z))

'''Write a Python program that accepts a string and calculate the number of digits and letters. Sample Data : 12Pythond32 Expected Output : Letters 7 Digits 4'''

n = str(input("Write anything = "))
l = 0
d = 0
for i in n:
    if (i.isalpha()):
        l = l + 1
    elif(i.isdigit()):
        d = d + 1
    else:
        pass
print("the no. of letters are = ",l)
print("the no. of digits are = ",d)

'''Write a Python program to construct the following pattern, using a nested for loop. * * * * * * * * * * * * *'''

for i in range(0, 5):
    if (i <= 2):
        for j in range(0, i+1):
            print("*", end=" " )
        print()
    elif( 2 < i <= 3 ):
        for k in range(0, i-1):
            print("*", end=" ")
        print()
    elif(i == 4):
        for l in range(0, i-3):
            print("*", end=" ")
        print()

'''Find the sum of the series 8 +88 + 888 + 8888 + .. n terms. Take the n from the user.'''

n = int(input("Tell me a no. = "))

z = 8 + 88 + 888 + n

r = 11
a = 8

s = (a*((r**n)  - 1))/(r - 1) 

print(s)

'''Create a program that chooses a random number number between 1 and 9. Ask the user for a number between 1 and 9. Compare the user's number to the random number. If the user guessed the random number print "you guessed it!", if the user did not guess the random number print back to the user "try again". Give 3 chances to the user.'''

from numpy import random
z = random.randint(0,9)

n = int(input("Tell me a no. "))

if(z == n):
    print("you guessed it!")
else:
    print("try again")

'''Write for loop that will print “pbil” when “alphebetical” is the input'''

