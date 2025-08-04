input_string = input("Enter array elements (space-separated): ")
arr = [int(x) for x in input_string.strip().split()]
n = len(arr)
for i in range(0, n-1):
    for j in range(0, n-i-1):
        if arr[j] > arr[j + 1]:
            temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp
            
print("Final array after all operations:", arr)
