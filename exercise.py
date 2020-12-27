print("Follow me for python")
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
# Output of Q1 
#The no. of banana = 43
#3.0 dozens  and no. of extra banana = 7 


with open('test1.txt', "w") as asn1:
	for i in xrange(1,15):
    	asn1.write("This is line " + str(i) + "\n")
with open('test1.txt', "r") as readasn1:
	print(readasn1.read())

count = 0
with open('test2.txt', "w") as asn2:
    with open('test1.txt', "r") as asn1:
        for i in asn1:
            count += 1
            if (count <= 5):
                asn2.write(i)
with open('test2.txt', "r") as readasn2:
    print(readasn2.read())

count = 0 
with open('test3.txt', "w") as asn3:
    with open('test1.txt', "r") as asn1:
        for i in asn1:
            count += 1
            if (7 <= count <= 15):
                asn3.write(i)
                
with open('test3.txt', "r") as readasn3:
    print(readasn3.read())

with open('test4.txt', "w") as asn4:
    with open('test2.txt', "r") as readasn2:
        for i in readasn2:
            asn4.write(i)
    with open('test3.txt', "r") as readasn3:
        for j in readasn3:
            asn4.write(j)
with open('test4.txt', "r") as readasn4:
    print(readasn4.read())
      
'''A day has 86,400 secs (24*60*60). Given a number in the range 1 to 86,400, output
the current time as hours, minutes, and seconds with a 24-hour clock. For example:
70,000 sec is 19 hours, 26 minutes, and 40 seconds. ''' 

#Ans.
if (n > 0):
    print("hours = " + str((n/86400)*24) + "Minutes = " + str(n/60) +"Seconds =" + str(n/60))
    
    
'''If the lengths of the two parallel sides of a trapezoid are X meters and Y meters,
respectively, and the height is H meters, what is the area of the trapezoid?Write Python
code to output the area.
'''
x = int(input("length in meter = "))
y = int(input("length in meter = "))
h = int(input("what is the height = "))

z = ((x + y)/2)*h
print(z)

'''Consider a triangle with sides of length 3, 7, and 9. The law of cosines states that
given three sides of a triangle (a, b, and c ) and the angle C between sides a and b:
c 2 = a2 + b2 − 2*a*b*c os (C). Write Python code to calculate the three angles in the
triangle.
'''
import math

a = int(input("lenght of a = "))
b = int(input("lenght of b = "))
c = int(input("lenght of c = "))

C = math.cos(1)

angleToDegrees = math.degrees(C)

z =  - c**2 + a**2 + b**2 - 2*a*b*math.cos(C)

print(math.cos(C))

'''The radius and mass of the Earth are r = 6378×103 meters andm1 = 5.9742×1024 kg,
respectively. Mr. Jones has amass of X kg. Prompt the user to input X and then calculate
the gravitational force (F ) and acceleration due to gravity ( g ) caused by the gravitational
force exerted on him by the Earth. Remember, F = G(m1)(m2)/(r 2) and F = mg .
Let the universal gravitational constant G = 6.67300 × 10−11 (in units of m3kg−1s −2
assuming the MKS [meter-kilogram-second] system). Check that the resulting value of
g is close to 9.8m/s2.
'''

r = 6378 * 10**3
m1 = 5.9742*10**24
G = 6.67300*10**(-11)
m2 = int(input("Mr. Jones mass = "))

F = (G*m1*m2)/r**2 

print(F)

g = F/m2

print(g)

'''(Using modules) Python comes with hundreds of modules. Here is a challenge for you:
find a module that you can import that will generate today’s date so you can print it.
Use your favorite search engine for help in finding which module you need and how
to use it. In the end, your task is to do the following:
>>> print("Today’s date is:", X )
'''
from datetime import date
today = date.today()
print("Today's date is : ", today)

'''In football, there is a statistic for quarterbacks called the passer rating. To calculate the
passer rating, you need five inputs: pass completions, pass attempts, total passing yards,touchdowns, and interceptions. There are five steps in the algorithm. Write a program
that asks for the five inputs and then prints the pass rating:
(a) C is the “completions per attempt” times 100 minus 30, all divided by 20.
(b) Y is the “yards per attempt” minus 3, all divided by 4.
(c) T is the “touchdowns per attempt” times 20.
(d) I is 2.375 minus (“interceptions per attempts” times 35).
(e) The pass rating is the sum of C, Y, T, and I, all divided by 6 and then multiplied
by 100.'''

passcompletions = int(input("pass completions = "))
passattempts = int(input("pass attempts = "))
totalpassingyards = int(input("total passing yards = "))
touchdowns = int(input("touchdowns = "))
interceptions = int(input("interceptions = "))

C = (100 * passcompletions - 30)/20
Y = (totalpassingyards - 3)/4
T = 20 * touchdowns
I = (35 * interceptions) - 2.375

passrating = ((C + Y + T + I )/6)*100

print(passrating)

'''Body mass index (BMI) is a number calculated from a person’s weight and height.
According to the Centers for Disease Control and Prevention, the BMI is a fairly
reliable indicator of body fatness for most people. BMI does not measure body fat
directly, but research has shown that BMI correlates to direct measures of body fat,
such as underwater weighing and dual-energy X-ray absorptiometry. The formula for
BMI is
we ig ht/heig ht2
where weight is in kilograms and height is in meters.
(a) Write a program that prompts for metric weight and height and outputs the BMI.
(b) Write a program that prompts for weight in pounds and height in inches, converts
the values to metric, and then calculates the BMI.'''

weight = int(input("what is weight = "))
height = int(input("what is height =  "))

BMI = weight/height**2

print(BMI)

'''hello'''

#Replace all ______ with rjust, ljust or center. 

thickness = int(input()) #This must be an odd number
c = 'H'

#Top Cone
for i in range(thickness):
    print((c*i).rjust(width,'-')(thickness-1)+c+(c*i).ljust(width,'-')(thickness-1))

#Top Pillars
for i in range(thickness+1):
    print((c*thickness).center(width,'-')(thickness*2)+(c*thickness).ljust(width,'-')(thickness*6))

#Middle Belt
for i in range((thickness+1)//2):
    print((c*thickness*5).ljust(width,'-')(thickness*6))    

#Bottom Pillars
for i in range(thickness+1):
    print((c*thickness).center(width,'-')(thickness*2)+(c*thickness).ljust(width,'-')(thickness*6))    

#Bottom Cone
for i in range(thickness):
    print(((c*(thickness-i-1)).rjust(width,'-')(thickness)+c+(c*(thickness-i-1)).center(width,'-')(thickness)).ljust(width,'-')(thickness*6))

    my_var = 6
if my_var % 2:
    if my_varvar**3 != 27:
        my_var = my_var + 4

    else:
        my_var /= 1.5 # Assignment 2
else:
    if my_var <= 10:
        my_var *= 2 # Assignment 3
    else:
        my_var -= 2 # Assignment 4
print(my_var)

''' Use list_three and print the strings where sum of letter’s position are greater than 30. “a” has position 1 and “z” has position “26”. Example string “us” has two letters ‘u’ has position 21 and ‘s’ has position 19, so sum is 40 and greater than 30 and we are going to print it'''
list_three = ["us","we","in","you","city","zebra","lion","btech","minister","so","bharat"]

def cha_val(x):
    list_pos = []
    for i in x:
        list_pos.append(ord(i)-96)
    
    n = sum(list_pos)
    if (n > 30):
        return "Yes " + x + " value is above 30"
    else:
        return "No " + x + "value is less then 30"
    

for x in range (len(list_three)):
    z = cha_val(list_three[x])
print(z)

'''Another Solution of same problem'''
list_three = ["us","we","in","you","city","zebra","lion","btech","minister","so","bharat"]

def cha_val(x):
    list_pos = []
    for i in x:
        list_pos.append(ord(i)-96)
    
    n = sum(list_pos)
    if (n > 30):
        return "Yes " + x + " value is above 30"
    else:
        return "No " + x + " value is less then 30"
    
cha_val("minister")

df = pd.DataFrame(stu_sub)

x = df[["Subject_2"]].to_numpy()
y = df[["Name"]].to_numpy()

plt.hist(x,bins= (50,60,70,80,90,100))
plt.xlabel("Students in this group")
plt.ylabel("Marks")
plt.title("Marks distribution")
fig = plt.figure(figsize = (10,10))
plt.show()

x = np.arange(0,8*np.pi,0.1)
y = np.sin(x)

plt.plot(x,y,'o-r',ms = 10,alpha = 0.4,mfc = 'blue')
plt.show()

dict = {"rishab": 85, "pratham": 77, "Sahil": 74, "Bhvya": 77,"varsha": 44,"mehak": 90,"moomal": 49,"kritika": 88}
plt.scatter(dict.keys(),dict.values(), color = "red",alpha = 0.5)
fig = plt.figure(figsize = (30,300))
plt.show()

import matplotlib.pyplot as plt
import numpy as np

students = ["Shakir","Rishab","pratham","Sahil","Bhavya","Varsha","Mahek","Moomal"]
sub_3_marks = [77,89,69,69,47,47,95,55]
plt.bar(students, sub_3_marks, color = ["red","blue","green","purple","black","Maroon","lavender","yellow"])
fig = plt.figure(figsize = (20,20))
plt.show()