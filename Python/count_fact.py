import math
n = int(input("Enter a number to find its factors: "))
count = 0
sqrt_n = int(math.sqrt(n))
for i in range(1, sqrt_n + 1):
    if n % i == 0:
        if i == n // i:
            count += 1
        else:
            count += 2

print("The count of factors is:", count)
