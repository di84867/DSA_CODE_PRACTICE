arr = []
print("Enter the number of elements in the array:")
n = int(input())
print("Enter the elements of the array:")
arr = list(map(int, input().strip().split()))

for i in range(1, n):
    arr[i] += arr[i-1]

print("Enter the number of queries:")
q = int(input())
L = []
R = []
print("Enter the queries (L and R):")
for _ in range(q):
    l, r = map(int, input().strip().split())
    L.append(l)
    R.append(r)

for query in range(q):
    l = L[query]
    r = R[query]

    if l == 0:
        print(arr[r])
    else:
        print(arr[r] - arr[l-1])
