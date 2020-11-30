print("I will add here my Python Exercises")

 -*- coding: utf-8 -*-

Spyder Editor

This is a temporary script file.


n = int(input("a no. "))

x = ((n + 2)*3 - 6)/3
print(x)

print(7 + 7 + 7 + 7)

my_int = 5
my_int += 3
print(my_int)

print(4//5)

print(30 - 3 ** 2 + 8 // 3 ** 2 * 10)

print((2**2)**3)

n = input("a no. ")
n_int = int(n)
n_float = float(n)
n_str = str(n)

print(n_int)
print(n_float)
print(n_str)

a = str(input("a = "))
b = str(input("b = "))
c = str(input("c = "))

print((a + b)*c)

n = int(input("n = "))
if(n%2 == 1):
    print("1")
elif(n%2 == 0):
    print("0")
    
import turtle

turtle.forward(100)
turtle.right(144)
turtle.forward(100)
turtle.right(144)
turtle.forward(100)
turtle.right(144)
turtle.forward(100)
turtle.right(144)
turtle.forward(100)
turtle.right(144)
turtle.forward(100)
turtle.right(144)
turtle.forward(100)

''' Q-1 Program for calculating bananas in dozen. The user will enter the number of bananas gathered and the program will output the number of dozens as well as the number of excess bananas. Continue this process until a negative number is entered. Example: Enter the number of bananas gathered: 43 You have 3 dozen and 7 bananas.'''
n = int(input("The no. of banana = "))

if(n%12==0):
    i = n/12
    print(i)
elif(n%12==1):
    j = ((n-1)/12)
    print(j, "dozens  and no. of extra banana = 1 ")
elif(n%12==2):
    j = ((n-2)/12)
    print(j, "dozens  and no. of extra banana = 2 ")
elif(n%12==3):
    j = ((n-3)/12)
    print(j, "dozens  and no. of extra banana = 3 ")
elif(n%12==4):
    j = ((n-4)/12)
    print(j, "dozens  and no. of extra banana = 4 ")
elif(n%12==5):
    j = ((n-5)/12)
    print(j, "dozens  and no. of extra banana = 5 ")
elif(n%12==6):
    j = ((n-6)/12)
    print(j, "dozens  and no. of extra banana = 6 ")
elif(n%12==7):
    j = ((n-7)/12)
    print(j, "dozens  and no. of extra banana = 7 ")
elif(n%12==8):
    j = ((n-8)/12)
    print(j, "dozens  and no. of extra banana = 8 ")
elif(n%12==9):
    j = ((n-9)/12)
    print(j, "dozens  and no. of extra banana = 9 ")
elif(n%12==10):
    j = ((n-10)/12)
    print(j, "dozens  and no. of extra banana = 10 ")
elif(n%12==11):
    j = ((n-11)/12)
    print(j, "dozens  and no. of extra banana = 11 ")
