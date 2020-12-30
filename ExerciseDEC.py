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

n = input("Tell me something = ")

if (n.isalpha()):
     for i in range(0,10):
        print("pbil")

'''Write a program that checks to see if a number N is prime. A simple approach checks all numbers from 2 up to N, but after some point numbers are checked that need not be checked. For example, numbers greater than √N need not be checked. Write a program that checks for primarily and avoids those unnecessary checks.'''

import math
N = int(input("Tell me a no. = "))

if N > 1:
    for i in range(2,N):
        if(N % i)==0:
            print(N ," is not a prime no.")
            print(i, " Times", N//i, "is ", N)
            break
    else:
        print(N," That is a prime no.")
        
else:
    print(N, " is not a prime number")

''' Make a list of players from the user. Write a program to create two teams randomly selected from the list.'''

ply = []
import random
team1 = []
team2 = []

for i in range(11):
    ply.append([str(input("Give me players " + str(i) + " "))])
    
print("The players are ",ply)

for i in range(6):
    team1.append(random.choice(ply))
    team2.append(random.choice(ply))
print(team1)
print(team2)

'''Take a 2 digit number as input from the user. Find the square of it, identify the resulting 3 digit number which has its 2 digits at the rightmost position similar to the original digits
Example: input: AB
AB*AB = CAB for some C'''

n = int(input("Give me a two digit no. "))

z = n**n
print("The square of the number is = "+ str(z))

j = z%100

if(j == n):
    print("the rightmost position is = ",j)
else:
    ("They are not equal")

'''Functions'''

def do_smoking(age):
    if(age < 18):
        return "Are you NUTS? I'll call your DAD"
    elif(age >= 18):
        return "Don't act cool! you'r are a idiot"
    else:
        ("Don't smoke, It'll cost you your life.")

li1 = []
def fruit(word):
    count = 0
    li1 = ["banana", "apple", "orange", "grapes", "mango"]
    for i in li1:
        count = count + 1
        if(word == i):
            return "This is a fruit in li1 basket " + word
        else:
            return "This is not a fruit from li1 basket " + word

'''voting'''

def pls_vote(candidate, b="Vote"):
    if(candidate == "Modi Ji"):
        return "My " + b + "will go to " + candidate
    elif(candidate == "Rahul"):
        return  "My " + b + "will go to " + candidate
    else:
        return "NOTA"

'''election'''

def election(voter, age , candidate):
    voter_list = ["Keshaw", "Kaushal", "Rohit", "Himanshu", "Kartik", "Komal", "Ankita"]
    count = 0
    if (age >= 18):
        for i in voter_list:
            count = count + 1
            if (voter == i):
                return voter + " will vote this " + candidate
            elif (voter != i):
                return "You must add your name to voter_list."
                return voter_list.append(input("Please tell me your name "))
        
    elif(age < 18):
        return voter + ", you must be over 18 to vote!"

'''Write a three digit no. divisible by 17'''

for k in range(100,1000):
    if (k % 17 == 0):
        print("These are thr number ")

'''In an earlier set of exercises, you were asked to calculate one’s BMI. Augment that
program by printing out where that BMI fits in the CDC standard weight status
categories:'''

BMI = int(input("Tlell me your bmi "))
if (BMI < 18.5):
    print("underweight")
elif(18.5 < BMI < 24.9):
    print("Normal")
elif(25 < BMI < 29.9):
    print("Overweight")
else:
    print("Obese")

'''You have house price dataset on Slack. You are going to buy a house which has price below median price and large garage size. select top 5 houses with these constraints and create a new separeted csv file.'''
import pandas as pd

data = pd.read_csv("housepricedata.csv")
print(data)


'''
import pandas as pd

data = pd.read_csv("housepricedata.csv", index_col= 0)
print(data[["GarageArea", "AboveMedianPrice"]])
print(data.loc[[10859, 7388, 9550, 12358, 6900]])
'''
'''Write a short program that will:
 prompt the user for a number
 print out whether the number is a perfect square
 prompt the user for another number if the input was not a perfect square '''

import math
n = int(input("Tell me a number "))
root = math.sqrt(n)
if (int(root + 0.5)**2 == n):
    print("Yeah this no. is perfect square")
else:
    print()

def go_wish(*Names):
    for i in Names:
        print("Namaste " + i)
go_wish("Keshu", "Mohit", "Rohit", "Krishna")

def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

def max_2(z, n):
    if (z > n):
        print(str(z) + " is maximum")
    elif(n > z):
        print(str(n) + " is maximum")
    else:
        print("These both are equal")

max_2(int(input("Whats z = ")),
     int(input("Whats n = ")))

def max_3(x, z, n):
    if (x > z and x > n):
        print(str(x) + " is maximum")
    elif(z > x and z > n):
        print(str(z) + " is maximum")
    elif(n > x and n > z):
        print(str(n) + " is maximum")
        
max_3(int(input("Whats x = ")),
      int(input("Whats z = ")),
     int(input("Whats n = ")))

def army_slc(name, age, fitness):
    if(age > 18):
        if(fitness == "Good"):
            return "You'll need to increse you fitness strength " + "Mr. " + name
        elif(fitness == "Excellent"):
            return "You can join THE INDIAN ARMY " + "Mr. " + name
        else:
            return "Go Home"

army_slc("Tony", 22, "Good")
army_slc("Steve", 23, "Excellent")

import matplotlib.pyplot as plt
import numpy as np
import math

x = np.arange(0,4*np.pi,0.1)
y = np.sin(x)


plt.plot(x,y)
plt.show()

x = [1,2,3,4,5,6,7,8,9,10]
y = [1,8,27,64,125,216,343,512,729,1000]

plt.plot(x,y, 'o-g', ms = 10, mec = 'blue', mfc = 'yellow')
plt.show()

x = [1,2,3,4,5,6,7,8,9,10]
y = [1,4,9,16,25,36,49,64,81,100]

plt.plot(x,y, linestyle = 'steps',animated = 'true')
plt.show()

x = [1,2,3,4,5,6,7,8,9,10]
y = [1,9,1,9,1,9,1,9,1,9]

plt.plot(x,y,'o-b', ms = 10, mfc = 'red', mec = 'black', linestyle = ':')
plt.show()

'''Use list_one and find the difference between the sum of values of even index and odd_index.'''
list_one = [24,4,654,23,345,654,3,1,45,3,23,23,33]

val_even = []
val_odd = []

for i in range (0, len(list_one)):
    if (i%2==0):
        val_even.append(list_one[i])
    else:
        val_odd.append(list_one[i])
        
print(val_even)
print(val_odd)

n = sum(val_even)
z = sum(val_odd)

print(n)
print(z)

diff_Even_Odd = n - z
print(diff_Even_Odd)

'''Use list_one, create list_four by adding first and last element then second and second last then third and third last and so on like. Print list_four.'''
list_one = [24,4,654,23,345,654,3,1,45,3,23,23,33]
list_1 = []
list_2 = []
list_four = []

for i in range (0,len(list_one)):
    list_1.append(list_one[i])
for j in range(len(list_one)-1,-1,-1):
        list_2.append(list_one[j])
        
for i in range(0,len(list_1)):
    list_four.append(list_1[i] + list_2[i])
print(list_1)
print(list_2)
print(list_four)

print("hello")

import pandas as pd
import numpy as np

en_show = pd.read_csv("ASN_1.csv")
en_show = en_show.head(10)

df = pd.DataFrame(en_show)
df

df[["SCAM1992","THE FAMILY MAN","SPECIAL OPS","PAATAL LOK","PANCHAYAT","SCARED GAMES","MIRZAPUR","PITCHERS","ASUR","KOTA FACTORY"]].to_numpy()

import numpy as np
from numpy import linalg as LA

A = np.array([[0,1,1,0],[0,0,1,0],[0,0,0,1],[1,1,0,0]])
A
X0 = np.array([[1],[1],[1],[1]])
X0

def iteration(A,X,i):
    X_i = (np.matmul(A,X))
    maxx = np.max(X_i)
    X_i = X_i/maxx
    return "X",i, X_i
    
    for j in range(0,i):
        print(X_i)


'''Write code to find the deviation of list_four elements from the average of list_four elements. (use list_four created in Q.2) and print.'''
import pandas as pd
import numpy as np

list_four

df = pd.DataFrame(list_four)
print(df)
print("Deviation = ",df.std())

import numpy as np
X=[]
eigen=[0]
X.append(np.array([[1],[1],[1],[1],[1],[1],[1],[1],[1],[1]]))
print(A,'\n\n',X)
print("-----------------------------------------")

i=0
while len(eigen)==1 or np.round(eigen[i],2)!=np.round(eigen[i-1],2):
    X.append(np.matmul(A,X[i]))
    eigen.append(max(X[i+1]))
    X[i+1]= np.round(X[i+1]/eigen[i+1],4)
    print("Iteration",i+1,":")
    print(X[i+1],"\t",eigen[i+1])
    print()
    i+=1

import matplotlib.pyplot as plt
import numpy as np

df = pd.DataFrame(stu_sub)
lis1 = df.to_numpy()

x = df[["Subject_1"]].to_numpy()
y = df[["Name"]].to_numpy()
fig = plt.figure(figsize = (10,10))
plt.pie(x,labels = y)
plt.show()

'''Append and remove some all names starting with h from set of names. Comment on the given task.'''
set_of_names = ['hj', 'kv', 'on', 'fi', 'cg', 'kd', 'hs', 'jn', 'si', 'ds', 'oc', 'jq', 'cy', 'og', 'yh', 'gr', 'id', 'kl', 'oi', 'ob', 'tr', 'iv', 'df', 'kj', 'js', 'vl', 'gj', 'ai', 'ih', 'gy', 'hf', 'jh', 'of', 'aj', 'ru', 'fk', 'je', 'hv', 'oj', 'sc', 'he', 'bn', 'le', 'os', 'wq', 'av', 'bv', 'oh', 'eo', 'wh', 'gu', 'ck', 'nc', 'we', 'qr', 'bf', 'nb', 'gi', 'vj', 'ld', 'un', 'io', 'hc', 'jt', 'wb', 'sa', 'vk', 'sk', 'ou', 'ri', 'fe', 'cb', 'du', 'vg', 'vp', 'kh', 'cc', 'ga', 'gc', 'ad', 'fy', 'fv', 'if', 'eg', 'od', 'ov', 'ir', 'vh', 'bd', 'vi', 'as', 'qi', 'jd', 'ha', 'au', 'gs', 'hi', 'gh', 'ij', 'vu', 'do', 'fa', 'uf', 'vs', 'lk', 'bc', 'sv', 'ge', 'qe', 'fg', 'hd', 'fd', 'ka', 'ry', 'er', 'fs', 'fo', 'tg', 'or', 'bk', 'jf', 'fj', 'jv', 'ew', 'dn', 'hy', 'hh', 'uh', 'pr', 'hu', 'vc', 'iu', 'po', 'bq', 'fh', 'gg', 'jc', 'sf', 'lf', 'sd', 'ie', 'ff', 'vd', 'db', 'wf', 'wc']

removed_h = []
for i in range(len(set_of_names)):
    if(set_of_names[i][0] == "h"):
        removed_h.append(set_of_names[i])
print(removed_h)

set_of_names = set(set_of_names)
new_names = set_of_names.difference(removed_h)
print(new_names)

list_three = ["us","we","in","you","city","zebra","lion","btech","minister","so","bharat"]

def cha_val(x):
    list_pos = []
    for i in x:
        list_pos.append(ord(i)-96)
    
    n = sum(list_pos)
    if (n > 30):
        return "Yes " + "==>" + x + "<==" + " value is above 30"
    else:
        return "No " + "==>" + x + "<==" + "value is less then 30"
    

for x in range (len(list_three)):
    print(cha_val(list_three[x]))

'''Use list_two and make slicing where starting index 6, stop index 2 and step of -1 and append this slicing to list_one. Then find the length, sum, average, minimum, maximum of list_one and Print. (Do not use predefined function like min (), max(), len() and sum())'''
import pandas as pd
import numpy as np

list_one = [24,4,654,23,345,654,3,1,45,3,23,23,33]
list_two = [23.4,23,234.34,63,48.9,21,45,98.4,78.4]

for i in range(6,1,-1):
    list_one.append(list_two[i])
print(list_one)

z = 0
n = []
j = []

list_one.sort(reverse=False)
for i in range(0,len(list_one)):
    z = z + list_one[i]

    if(list_one[i-1] > list_one[i]):
        n.append(list_one[i-1])

    if(list_one[i] < list_one[i-1]):
        j.append(list_one[i])

print("Sum of all elements of list_one is = ", z)
print("Length of list_one is = ", i)
print("Maximum value in list_one is = ", n)
print("Minimum value in list_one is = ", j)