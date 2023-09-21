#problem link: https://open.kattis.com/problems/99problems
import sys
import math

def main():
    # input = sys.argv[1]

    for line in sys.stdin:
        input = int(line)
        break
        
        # print(data)


    # print("input: " + input)

    if (int(input) <= 100):
        # print("test")
        print(99)
    else: 
        
        # determine how many times 100 goes into something (as a decimal)
        x = int(input) / 100

        print(x % 99)

        if ((x % 1) < 0.49):
             output = (round(x) * 100) - 1
            # round down
        else:
            output = (math.ceil(x) * 100) - 1




        print(output)

if __name__ == "__main__":
    main()