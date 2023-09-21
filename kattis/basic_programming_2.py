# https://open.kattis.com/problems/basicprogramming2
from collections import Counter
import math
import sys

# input = sys.stdin.readline()
# input = input.split(" ")

# n = int(input[0])
# t = int(input[1])

# input2 = sys.stdin.readline()
# input2 = input2.split(" ")

# array = []
# for x in input2:
#     array.append(int(x))

# print(array)
n, t = map(int, input().split())
array = list(map(int, input().split()))

yes = False

# Task 1: check if any two numbers in array add up to 7777
if (t ==1):
    for i, x in enumerate(array):
        for y in (array[(i + 1):]):
            if x+y == 7777:
                print("yes")
                yes = True

    if (yes == False):
        print("no")
elif (t == 2):

    # Task 2: check for duplicates
    if (len(array) == len(set(array))):
        print("Unique")
    else:
        print("Contains duplicate")
elif (t == 3):

    # Task 3: check if any value appears over N/2 times
    # majority = False

    # for x in array:
    #     c = array.count(x)
    #     if c > (n / 2):
    #         print(x)
    #         majority = True
    #         break

    # if (majority == False):
    #     print(-1)
    size = n/2
    check, n = Counter(array).most_common(1)[0]
    if n > size:
        print(check)
    else:
        print(-1)

elif(t == 4):
    

    # Task 4: get median
    array.sort()
    i = math.floor((n - 1)/2)
    # print(i)
    
    if (n % 2 == 0):
        print(f"{array[i]} {array[i + 1]}")
    else:
        print(f"{array[i]}")
elif(t == 5):
    # Task 5: get values between 100, 999
    results = []

    for x in array:
        if 100 <= x <= 999:
            results.append(x)
    results.sort()
    print(*results)
