# https://open.kattis.com/problems/risdomare
import sys

N = int(input())
# print(f"N: {N}")

portions = []

max = -1
options = [] # all indecies that have the max combination
type = ""


for i, x in enumerate(sys.stdin):
 
    if x.strip() == "antal" or x.strip() == "storlek":
        type = x.strip()
    else:

        input = x.split(" ")
        portions.append((int(input[0]), int(input[1])))
        
        value = int(input[0]) + int(input[1])
        if (value > max):
            options = [i ]
            max = value
        elif (value == max):
            options.append(i)
        
        

    
    if (i == N):
        break

# if there's only one option, print it
if len(options) == 1:
    print(options[0])
else:    
    highest = -1
    highest_i = -1
    
    if type == "antal":
        # find highest grain count
        
        for x in options:
            # print(portions[x - 1][0])
            if (portions[x - 1][0] > highest):  # subtract 1, since the indecies start at 1 becaues of antal/storlek
                # print("bruh")
                highest = portions[x - 1][0]
                highest_i = x
    elif type == "storlek":
          for x in options:
            # print(portions[x - 1][0])
            if (portions[x - 1][1] > highest):  # subtract 1, since the indecies start at 1 becaues of antal/storlek
                # print("bruh")
                highest = portions[x - 1][1]
                highest_i = x
    
    print(highest_i)