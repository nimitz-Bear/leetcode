# # problem link: https://open.kattis.com/problems/buildinghighways
import sys

count = int(sys.stdin.readline())

# read in the difficulty for each city
input = sys.stdin.readline()

input = input.split(" ")
cities = []
for x in input:
    cities.append(int(x))

print(cities)

# TODO: probably need to use a MST algroithm and get the sum of the MST



# # read in the difficulty for a highway connecting two given cities
# highways = count*[count*[0]]
# print(highways)
# for i, v1 in enumerate(input):
#     for j, v2 in enumerate(input):
#         highways[i][j] = int(v1) + int(v2)

# print(highways)

# n, arr = int(input()), list(map(int, input().split()))
# print(min(arr)*(n-2) + sum(arr))

# print(arr)
