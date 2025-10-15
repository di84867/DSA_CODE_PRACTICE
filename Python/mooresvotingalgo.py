n = int(input("Enter number of elements: "))
arr = []

print("Enter elements:")
for _ in range(n):
    num = int(input())
    arr.append(num)

candidate = arr[0]
count = 1

for i in range(1, n):
    if arr[i] == candidate:
        count += 1
    else:
        count -= 1
        if count == 0:
            candidate = arr[i]
            count = 1


count = 0
for i in range(n):
    if arr[i] == candidate:
        count += 1

if count > n // 2:
    print("Majority element is:", candidate)
else:
    print("No majority element found.")
