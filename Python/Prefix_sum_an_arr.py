arr = []
print("Enter the number of elements in the array:")
n = int(input())
print("Enter the elements of the array:")
for i in range(n):
    arr.append(int(input()))
prefix_sum = [0] * n
prefix_sum[0] = arr[0]
for i in range(1, n):
    prefix_sum[i] = prefix_sum[i - 1] + arr[i]
print("Prefix sum array:", prefix_sum)
print("Prefix sum of the array:")

prefix_sum_result = 0
for i in range(len(arr)):
    prefix_sum_result += arr[i]
    print("Prefix sum of the", i + 1, "elements:", prefix_sum_result)
    