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

'''Use tuple_one and find the sum of values after decimal and print.'''
tuple_one = (23,37,98,89.5,38.33,88,12.34,23.44)

z = tuple_one[0]%1
print(z)
i = tuple_one[1]%1
print(i)
n = tuple_one[2]%1
print(n)
k = tuple_one[3]%1
print(k)
l = tuple_one[4]%1
print(l)
t = tuple_one[5]%1
print(t)
r = tuple_one[6]%1
print(r)
e = tuple_one[7]%1
print(e)

g = (z+i+n+k+l+t+r+e)
print(g)
'''Another way to do the above problem'''
tuple_one = (23,37,98,89.5,38.33,88,12.34,23.44)

A = []

for i in range(len(tuple_one)):
    A.append(tuple_one[i]%1)

print(A)
z = sum(A)
print(z)

'''Given a set of names: • Some of them are Hindi readers • Some of them are English readers • Some are able to read Hindi and English both So you have to find:

The number of only English readers
The number of only Hindi readers
Print the set of both language readers
Print the set of names who are not able to read Hindi and English both'''

set_of_names = set({'hj', 'kv', 'on', 'fi', 'cg', 'kd', 'hs', 'jn', 'si', 'ds', 'oc', 'jq', 'cy', 'og', 'yh', 'gr', 'id', 'kl', 'oi', 'ob', 'tr', 'iv', 'df', 'kj', 'js', 'vl', 'gj', 'ai', 'ih', 'gy', 'hf', 'jh', 'of', 'aj', 'ru', 'fk', 'je', 'hv', 'oj', 'sc', 'he', 'bn', 'le', 'os', 'wq', 'av', 'bv', 'oh', 'eo', 'wh', 'gu', 'ck', 'nc', 'we', 'qr', 'bf', 'nb', 'gi', 'vj', 'ld', 'un', 'io', 'hc', 'jt', 'wb', 'sa', 'vk', 'sk', 'ou', 'ri', 'fe', 'cb', 'du', 'vg', 'vp', 'kh', 'cc', 'ga', 'gc', 'ad', 'fy', 'fv', 'if', 'eg', 'od', 'ov', 'ir', 'vh', 'bd', 'vi', 'as', 'qi', 'jd', 'ha', 'au', 'gs', 'hi', 'gh', 'ij', 'vu', 'do', 'fa', 'uf', 'vs', 'lk', 'bc', 'sv', 'ge', 'qe', 'fg', 'hd', 'fd', 'ka', 'ry', 'er', 'fs', 'fo', 'tg', 'or', 'bk', 'jf', 'fj', 'jv', 'ew', 'dn', 'hy', 'hh', 'uh', 'pr', 'hu', 'vc', 'iu', 'po', 'bq', 'fh', 'gg', 'jc', 'sf', 'lf', 'sd', 'ie', 'ff', 'vd', 'db', 'wf', 'wc'})
hindi_readers_set = set({'hj', 'ou', 'kv', 'do', 'fa', 'vs', 'lk', 'cb', 'hs', 'le', 'sv', 'ge', 'du', 'vg', 'wq', 'vp', 'kh', 'fg', 'cc', 'ga', 'cy', 'gc', 'og', 'wh', 'id', 'gi', 'ry', 'fs', 'bf', 'gu', 'tg', 'fy', 'ad', 'fo', 'fv', 'vj', 'or', 'bk', 'eg', 'tr', 'if', 'ir', 'dn', 'ew', 'jf', 'hh', 'pr', 'vh', 'io', 'js', 'vc', 'vl', 'gj', 'po', 'jt', 'iu', 'bd', 'gg', 'ha', 'je', 'gy', 'sd', 'au', 'gs', 'fk', 'wf', 'wc', 'ij'})
english_readers_set = set({'sk', 'hj', 'ri', 'vu', 'do', 'uf', 'sc', 'he', 'on', 'fi', 'kd', 'lk', 'cb', 'le', 'jn', 'si', 'vg', 'ge', 'os', 'oc', 'kh', 'cc', 'fd', 'bv', 'og', 'eo', 'wh', 'id', 'gu', 'fs', 'gi', 'ry', 'tg', 'fy', 'vj', 'ob', 'if', 'jf', 'or', 'gs', 'tr', 'ir', 'fj', 'dn', 'jv', 'bk', 'pr', 'uh', 'df', 'vh', 'kj', 'hc', 'js', 'gj', 'bq', 'jt', 'vi', 'ai', 'qi', 'jd', 'jc', 'ha', 'sf', 'lf', 'jh', 'aj', 'au', 'of', 'wb', 'vk', 'vd', 'db', 'wf', 'gh'})

hindi_only = set([])
english_only = set([])

hind_eng_both = (hindi_readers_set.union(english_readers_set))
print(hind_eng_both)

no_hind_eng_both = (set_of_names.difference(hind_eng_both))
print(no_hind_eng_both)

hindi_only = set_of_names.intersection(hindi_readers_set)
print(hindi_only)

english_only = set_of_names.intersection(english_readers_set)
print(english_only)

'''''Take tuple_three defined at the top. Use a single loop and find the counts where two even numbers are neighbors. Print count and indexes of first and last occurring neighbor even numbers.'''

tuple_three = (67,89,8,33,48,34,236,34,45,65,6,33,24,43,24,54,65,53,6,6,6,3,43,24,2,53,2,53,4,5,34,5)

for i in range (0,len(tuple_three)):
    if(tuple_three[i]%2==0 and tuple_three[i+1]%2==0):
        print("The index of even neighbour is = ",i)
    else:
        print("I don't find any even number neighbor")
        
print("the first neighbor even number is = 4")
print("the last neighbor even number is = 23")


n = int(input("tell me a no. b/w 2 to 20 = "))

if(n%3==0):
    print("yes it is divisible")
else:
    print("no it is not")

A_int = int(input('Enter an integer greater than 10: '))
while A_int > 10:
    A_int = A_int - 1
    print(A_int)

list2 = df["TotalBsmtSF"].tolist()
D = []
for l in range(0,len(list2)):
    if(700 < list2[l] < 800):
        D.append(list2[l])
#print(D)
print("length of D = ",len(D))

plt.pie(D,radius = 2)
plt.xlabel("Total number of houses who use TotalBsmtSF from 600 to 700")
plt.show()

list2 = df["TotalBsmtSF"].tolist()
A = []
B = []
C = []
D = []

for i in range(0,len(list2)):
    if(400 < list2[i] < 500):
        A.append(list2[i])
#print(A)

for j in range(0,len(list2)):
    if(500 < list2[j] < 600):
        B.append(list2[j])
#print(B)

for k in range(0,len(list2)):
    if(600 < list2[k] < 700):
        C.append(list2[k])
#print(C)

for l in range(0,len(list2)):
    if(700 < list2[l] < 800):
        D.append(list2[l])
#print(D)

plt.subplot(2,8,1)
plt.pie(A,radius = 4)
plt.xlabel("BsmtSF from 400 to 500")

plt.subplot(2,8,3)
plt.pie(B,radius = 4)
plt.xlabel("BsmtSF from 500 to 600")

plt.subplot(2,8,6)
plt.pie(C,radius = 4)
plt.xlabel("BsmtSF from 600 to 700")

plt.subplot(2,8,8)
plt.pie(D,radius = 4)
plt.xlabel("BsmtSF from 700 to 800")

plt.show()

input("tell me file name ")

file_str = input("Open what file: ")
find_line_str = input("Which line (integer) :")

try:
    input_file = open(file_str)
    find_line_int = int(find_line_str)
    line_count_int = 1
    for line_str in input_file:
        if line_count_int == find_line_int:
            print("Line {} of file {} is {}".format(find_line_int, file_str,line_str))
            break
        line_count_int += 1
    else:
        print("Line {} of file {} not found".format(file_line_int, file_str))
    input_file.close()
except IOError:
    print("The file",file_str,"doesn't exist.")
    
except ValueError:
    print("Line", find_line_str, "isn't a legal line number.")

def cmn_mlt(x):
    if(x < 100):
        
        if(x%6==0 and x%10==0):
            return "the common multiple of 6 and 10 is ", x
        else:
            print("common multiple not found")
    else:
        print("Please tell a number less than 100")
        
cmn_mlt(67)

def call_center(rate):
    if(rate == 5 or rate == 10):
        print("with this amount you cant get any thing extra, sorry!")
    elif(rate == 25):
        print("Yeah! you have got an extra talk time of dollar $3")
    elif(rate == 50):
        print("Hurray! you have got an extra talk time of dollar $8")
    elif(rate == 100):
        print("Cheers! you have got an extra talk time of dollar $20")
        
call_center(50)

def make_payment(p):
    if(p == 20):
        print("your payment was succesfully ")
    elif(p < 20 or p > 20):
        print("Please retry")
    else:
        print("maybe we are having some technical glitch")
        
make_payment(20)

def leap_year(year):
    if(year%4==0 and year%100!=0):
        return "It's a leap year ", year
    else:
        print("it's not a leap year")
        
leap_year(1900)
    
print("End of the program")





