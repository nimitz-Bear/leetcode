import sys

us = sys.stdin.readline()

total = 0

for x in us:
    # print(x)

    if (x == 'u'):
        total = total + 1

print(total)