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

n = int(input("tell me a number = "))
count = 0
for i in range(1,n+1):
    count = count + i
    print(count) #b and c part is pending

n = input("Tell me an integer ")

if(n.isdigit()):
    print("correct")
else:
    print("try again")

import math
N = int(input("tell me no. "))

for i in range(2,N):
    if(N//i == i and N/i == i):
        print("that's not a prime number")
    else:
        print("it is prime number")

        print("My pc is lagging what should i do.")

while 5 > 2:
    print("hello")
    if (5 == 12):
    break

i = 3
while i > 2:
    print("hello")
    i = i + 1
    if (i == 12):
        break

'''In the exercises for Chapter 1, an algorithm was given for calculating the pass rating for
football quarterbacks. One can use the pass rating to determine whether a quarterback
had a mediocre, good, or great year. A rating is poor if it is 85 or below, mediocre if
above 85, good if above 90, and great if above 95. Add to the pass rating program to
output “poor,” “mediocre,” “good,” or “great.”
To test your program, you can look up actual data on www.nfl.com or use the
following information from 2007:
Completions Attempts Yards Touchdowns Interceptions
Donovan McNabb 180 316 2647 18 6
Tom Brady 319 516 3529 24 12
Peyton Manning 362 557 4397 31 9'''

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

if(passrating <= 85):
    print("It is poor")
    
elif(passrating > 85):
    print("mediocre")
elif(passrating > 90):
    print("good")
elif(passrating > 95):
    print("great")

'''Find the two-digit number such that when you square it, the resulting three-digit
number has its rightmost two digits the same as the original two-digit number. That is,
for a number in the form AB, AB*AB = CAB for some C.'''

n = int(input("Tell me a two digit no. = "))

z = n*n 
k = z%100

if(k == n):
    print("Yes",k)
else:
    print("you are wrong")

import matplotlib.pyplot as plt
df = pd.DataFrame(data)
#df[["TotalBsmtSF"]]
list1 = df["TotalBsmtSF"].tolist()
list2 = df["GarageArea"].tolist()

A = []
j = []
for i in range(len(list1)):
    if(400<list1[i]<800):
        A.append(list1[i])
print(A)

for i in range(len(list2)):
    if(400<list2[i]<800):
        j.append(list2[i])
print(j)

plt.pie(A,radius= 4.4)
plt.xlabel("Graph of TotalBsmtSF in range 400 to 800")

plt.show()

def letters(n):
    for i in n:
        if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
            print("total vowels are ",i)
        else:
            print("total consonent are ",i)
            
letters(input("tell me a string = "))

def display_menu():
    menu = ["app","game","message","camera","phone"]
    for i in menu:
        return i
    
    def choice(i):
        return "so this is my menu app " + i

print(display_menu())

def fnl_sco(x,z):
    if(x > z):
        print("team 1 won")
    elif(x < z):
        print("team 2 won")
    else:
        print("the game was a tie")
        
fnl_sco(2,4)

def einstein(mass):
    c = 350
    E = mass*c**2
    return E

einstein(200)

def func1(str1,str2):
    if(str1 > str2):
        result_str = str1[1:]
    else:
        result_str = str2[:-1]
    return result_str

response1_str = input("Enter a string: ")
response2_str = input("Enter a second string: ")

print(func1(response1_str, response2_str))
print(func1(response2_str,response1_str))

def prompt_open(flnm):
    if(flnm == "investment"):
        with open("innvest.txt","r") as flnm:
            print(flnm.read())
            print(flnm.mode)
    else:
        print("try again")
            
prompt_open("hello")

safe_input = input("tell me something =")
if(safe_input.isdigit() or safe_input.isalpha()):
    print("correct type")
    
else:
    input("tell me again ")

def dt_tm(month,date,year,hour,mn,sec):
    print(date ,"/", month ,"/" ,year)
    print(hour,":",mn,":",sec)
    print(month,"/",year)
    if(int(hour) < 12):
        print("It is AM")
    else:
        print("It is PM")
        
dt_tm(input("month = "),input("date = "),input("year = "),input("hour = "),input("min = "),input("sec = "))

def dt_tm(month,date,year,hour,mn,sec):
    if(int(date) <= 31 and int(month) <= 12 and int(hour) <= 24 and int(mn) <= 60 and int(sec) <= 60 ):
        print(date ,"/", month ,"/" ,year)
        print(hour,":",mn,":",sec)
        print(month,"/",year)
        if(int(hour) < 12):
            print("It is AM")
        else:
            print("It is PM")
            
    else:
        print("You have not entered valid numbers")
        
dt_tm(input("month = "),input("date = "),input("year = "),input("hour = "),input("min = "),input("sec = "))

import pandas as pd

A = pd.DataFrame({"day": ["Monday","Tuesday","Wednesday","Thursday","Friday"]})
A.set_index("day", inplace = True)
Students = " "
j = 0
while j != 10:
    Students = input("Enter the name Student ")
    j = j +1
    A[Students] = " "
inp = " "
while inp != 4:
    print("\n. Add attendance \n. Display Attendance \n. Students with less than 75% Attendance \n. exit")
    inp = int(input("Select an option : "))
    
    if inp == 1:
        print("Enter one of the following below ")
        day = input("What day is today : ")
        for i in A.columns:
            x = input(f'is {i} present(p) or absent(a) : ')
            A.at[day,i] = x
    if inp == 2:
        print(A)
    if inp == 3:
        t = int(A.shape[0])*0.75
        for i in A.columns:
            x = int(A.query(f'{i} == \'p\'').size)
            if x > t:
                print(i)

str_list = ["hi","mom","dad"]
num_list = [1,57,15]
num_list[-1] = 25
num_list

print(str_list + num_list)
print(str_list[0],num_list[-1])
print(str_list.append(num_list))
print(str_list)
#print(str_list.sort())
print(str_list)
print(str_list.extend([127,256]))
print(str_list)
print(str_list.pop(2))
print(str_list)

students = {"tony" : {},
           "raman" : {},
           "thor"  : {},
           "wanda" : {},
           "vision": {},
           "hulk"  : {},
           "arther": {},
           "james" : {},
           "bucky" : {},
           "zemo"  : {}
           }
flag1 = 0
days_string = "Monday/Tuesday/Wednesday/Thursday/Friday"
days = days_string.split("/")
while(flag1 == 0):
    print("Choose an option\n1.Add attendance\n2.Display attendance\n3.Display students who has attendance below 75%\n4. Exit.")
    option1 = int(input("\nEnter your choice : "))
    if option1 == 1:
        flag2 = 0
        while(flag2==0):
            option2 = input("Enter day (Monday/Tuesday/Wednesday/Thursday/Friday) : ")
            if option2 in days:
                print("\nEnter attendance in Y/N format \n")
                for j in students.keys():
                    flag3 = 0
                    while(flag3==0):
                        option3 = input(j +" : ")
                        if option3 in ("Y","y"):
                            students[j][option2]=1
                            flag3 = 1
                        elif option3 in ("N","n"):
                            students[j][option2]=0
                            flag3 = 1
                        else:
                            print("Incorrect input\n Try again")
                flag2 = 1
            else:
                print("Incorrect input \n Try again")
    elif option1 ==2:
        print("Names\Days")
        for k in students.keys():
            print(k,end="\t\t")
            for day,att in students[k].items():
                print(day,":",att,end="\t")
            print()
    elif option1 == 3:
        print("\nStudents who has attendance below than 75% are : \n")
        for j in students.keys():
            days_count = len(students[j])
            if sum(students[j].values())/(0.01*days_count) < 75:
                print(j)
    elif option1 ==4:
        flag1 = 1
    else:
        print("Incorrect input \n Re-enter\n")
        
    def market(cost,mmshp):
    cost = int(cost)
    if(mmshp == True):
        discount = cost*1/10 + cost*1/5
        new_price = cost - discount
        return new_price, "You got extra 5% discount because today is Father's Day"
    else:
        discount = cost*1/5
        new_price = cost - discount
        return new_price
    
market(10000,input("Do you have our membership True/False : "))


def driving(speed):
    if (speed <= 70):
        print("Ok")
    else:
        point = 0
        for i in range(0,200,5):
            if(speed + i > 70):
                print("You are going high.")
                point = point + 1
                print(point)
                if(point > 12):
                    print("License suspended")
                    break

driving(150)

L = [1,2,3,4]

for i in L:
#    r = "".join(i)
    print(i,end="")

list1 = [1,2,3,4,5,6,7,8,9,10]
listb = []
for i in range(len(list1),0,-1):
    listb.append(i)
    print(listb)

e = (3,5,"k","P","0","A","a")
def sortu(z):
    z.sort()
    return z

print(e)

def revstr(s):
    for i in range(len(s)-1,-1,-1):
        print(s[i],end="")
        
revstr("stressed")

L = ['Always', 'look', 'on', 'the', 'bright', 'side', 'of', 'life.']

List1=[[i.upper(), i.lower(), len(i)] for i in L if len(i)>4]
print(List1)

n = int(input("Tell me a number : "))

for i in range(1,n+1):
    if (n%i==0):
        print(i)

n = int(input("Tell me a number : "))
z = [[n%i==0] for i in range(1,n+1)]
print(z)

L = [23,44,55,76]
k = [i for i in L if(i%2==0)]
b = [j for j in L if(j%3==0 or j%5==0 or j%7==0 or j%13==0 or j%17==0 or j%23==0)]
print("For Even number : ",sum(k))
print("For Odd number : ",sum(b))

x = "January 1, 2000"
t = [i for i in x if(i.isalpha())]
print("".join(t))

Tuple = ()
l = list(Tuple)
for i in range(10):
    l.append(i)
    
print(sum(l))

l = []
n = []
def strn(s):
    for i in s:
        l.append(i)
        l.sort()
        n.append(i)
    print("".join(l))
    print("".join(n))
strn("hello")

'''Given a list of numbers, create a new list of numbers such that the first and last
numbers are added and stored as the first number, the second and second-to-last
numbers are stored as the second number, and so on. Note that you need to check
for even and odd length of lists. In case of an odd number of integers, leave the central
integer in the original list as it is.'''
list1 = [2,6,8,10,12,14]
list2 = []

def listchng(list1):
    if (len(list1)%2==0):
        list1.sort(reverse = True)
        for i in list1:
            list2.append(i)
        return list2

listchng(list1)

'''It is oftentimes advantageous to be able to transfer data between multiple lists while
rearranging their order. For instance, say that list1 = [1,2,3,4,5,6,7,8,9]
and you wish to add the numbers in the index range 4:7 of list1 to another
list, list2, in reverse order while simultaneously removing them from list1. If
list2 = [100,200], the result will be list2 = [100,200,7,6,5]. Write a
function named transform that takes as arguments list1, list2, r1, and r2,
that removes items from list1 in the slice r1:r2, appends them onto list2 in
reverse order, and returns the resulting list. For example, in this case, the function call
will be transform(list1, list2, 4,7).'''
list1 = [1,2,3,4,5,6,7,8,9]
list2 = [100,200]

def transform(list1,list2,r1,r2):
    for i in range(r1,r2):
        list2.append(list1[i])
    print(list2)
    
transform(list1,list2,4,7)

'''. Fractions:
You can express a fraction as a tuple: (numerator, denominator).
(a) Write a function that adds two fractions that are passed as tuples.
(b) Write a function that multiplies two fractions that are passed as tuples.'''
def adds(t1,t2):
    return t1 + t2
adds((2.5),(7.3))

def sums(t3,t4):
    return t3 * t4
sums((2.4),(1.2))


'''. Write your own versions of the Python built-in functions min and max. They should
take a list as an argument and return the minimum or maximum element. Hint: Pick
the first element as the minimum (maximum) and then loop through the elements to
find a smaller (larger) element. Each time you find a smaller (larger) element, update
your minimum (maximum).'''
y = [23,44,55,21]
mn = []
mx = []

def min_max(y):
    for i in range(len(y)):
        if(y[i] > y[i-1]):
            mx.append(y[i])
        else:
            mn.append(y[i])
    print("Max : ",max(mx))
    print("Min : ",min(mn))
    
min_max(y)

'''Write a function that takes a string as an argument and returns a list of the words in
the string'''
s = input("Tell me a word : ")
t = []

def stot(s):
    for i in s:
        t.append(i)
    print(t)
    
stot(s)


'''Given a list of N numbers, write a function to shift the numbers circularly by some
integer k (where k < N). The function should take a list and k as a arguments and
return the shifted list.
(a) Write a function that assumes shifting is to the left.
(b) Write a function that takes a third argument that specifies shifting left or right.'''
list1 = [1,3,5,7,9,11,13,15]
list2 = []
def list_cir(list1,k):
    for i in range(k,len(list1)):
        list2.append(list1[i])
    print(list2)
    for i in range(k):
        list2.append(list1[i])
    print(list2)
list_cir(list1,3)


import schemdraw
import schemdraw.elements as elm
d6 = schemdraw.Drawing()
d6.add(elm.SourceV(label="1$V$"))
d6.add(elm.Dot())
d6.push()
l1 = d6.add(elm.Line(d="right"))
d6.add(elm.Dot())
d6.add(elm.Line())
d6.add(elm.Dot())
l2 = d6.add(elm.Resistor(d="down",botlabel="1$\Omega$"))
d6.add(elm.Dot())
d6.add(elm.Resistor(d="left",botlabel="3$\Omega$"))
d6.add(elm.Dot())
d6.add(elm.Resistor(d="up",botlabel="7$\Omega$"))
d6.push()
d6.add(elm.Resistor(d="down"))
d6.add(elm.SourceI(d="down",label="2$A$",reverse=True))
d6.add(elm.Resistor(d="down",label="3$\Omega$"))
d6.add(elm.Dot())
d6.add(elm.Line(d="right"))
l3 = d6.add(elm.Line(d="up"))
d6.add(elm.Resistor(d="up",botlabel="2$\Omega$"))
d6.pop()
d6.add(elm.Line(d="left"))
d6.add(elm.Source(d="down"))
d6.add(elm.Line(d="down"))
d6.add(elm.Line(d="down"))
d6.add(elm.Line(d="right"))
d6.labelI_inline(l1,"$i_1$", d="in")
d6.labelI_inline(l2,"$i_2$",d= "in")
d6.labelI_inline(l3,"$i_3$",d="out")

d6.draw()