input_string = input("Enter array elements (space-separated): ")
arr = [int(x) for x in input_string.strip().split()]
n = len(arr)
k = 4  

start = 0
end = n - 1
while start < end:
    temp = arr[start]
    arr[start] = arr[end]
    arr[end] = temp
    start += 1
    end -= 1

print("\nAfter full array reverse:", arr)
