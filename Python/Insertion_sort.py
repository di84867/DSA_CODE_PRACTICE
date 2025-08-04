input_string = input("Enter array elements (space-separated): ")
arr = [int(x) for x in input_string.strip().split()]
n = len(arr)

for i in range(1, n):
    current_element = arr[i]
    j = i - 1
    while j >= 0 and current_element < arr[j]:
        arr[j + 1] = arr[j]
        j -= 1
    arr[j + 1] = current_element

print("Final array after all operations:", arr)