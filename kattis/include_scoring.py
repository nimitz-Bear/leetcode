import sys

def Get_Ranking(currentRank):
    points_and_ranks = {1:30 , 2:75, 3:60, 4:50, 5:45, 6:40, 7:36, 8:32, 9:29, 10:26, 11:24, 12:22, 13:20, 14:18, 15:16, 16:15, 17: 14, 18: 13, 19: 12, 20: 11, 21: 10, 22: 9, 23:8, 24:7, 25:6, 26:5, 27:4, 28:3, 29:2, 30:1}
    return points_and_ranks[currentRank]

# takes in a number of problems solved and determines the rankings
# note: this function needs to updatethe currentRank
def determine_rankings_for_problems_solved(problems_solved, currentRank):
    test = [] # entries for a given number of problems solved
    
    # if currentRank > 30, then there is no point ranking as it's 0 points
    if currentRank >= 30:
        return currentRank

    for i, contestant in enumerate(entries):

        if contestant[0] == problems_solved:
            # print(contestant)
            test.append((i, contestant))

        # add one for everyone that was on-site
        if contestant[3] == 1:
            output[i] = 1
    
    
    test.sort(key=lambda x: x[1][1], reverse=True)
    print(test)

    for contestant in test:
        ## break out if there are already 30 people ranked
        # if currentRank >= 30:
        #     return currentRank
        
        output[contestant[0]] =  output[contestant[0]] +  Get_Ranking(currentRank)
        currentRank = currentRank + 1

    return currentRank
    

count = int(sys.stdin.readline())

entries = []
currentRank = 1
output = [0] * count

for i, line in enumerate(sys.stdin):
    contestant = list(map(int, line.split(" ")))
  
    entries.append(contestant)

    if i == count - 1:
        break

# print(entries)
for num in range(1,9):
    # currentRank = determine_rankings_for_problems_solved(9 - num, currentRank)
    test = [] # entries for a given number of problems solved
    
    # if currentRank > 30, then there is no point ranking as it's 0 points
    if currentRank >= 30:
        break

    for i, contestant in enumerate(entries):

        if contestant[0] == 9 - num:
            # print(contestant)
            test.append((i, contestant))

        # add one for everyone that was on-site
        if contestant[3] == 1:
            output[i] = 1
    
    
    test.sort(key=lambda x: x[1][1], reverse=True)
    print(test)

    for contestant in test:
        ## break out if there are already 30 people ranked
        if currentRank >= 30:
            break
        
        output[contestant[0]] =  output[contestant[0]] +  Get_Ranking(currentRank)
        currentRank = currentRank + 1


print(f"output {output}")
