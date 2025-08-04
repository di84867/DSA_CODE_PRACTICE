n=int(input("Enter a number: "))
total=0
for i in range(1, n+1):
    total += i  
print(f"The sum of numbers from 1 to", n, "is:", total)