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