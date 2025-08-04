def print_valid_subarrays(arr, limit):
    n = len(arr)
    print("Valid subarrays:")
    for start in range(n):
        min_val = arr[start]
        max_val = arr[start]
        for end in range(start, n):
            min_val = min(min_val, arr[end])
            max_val = max(max_val, arr[end])
            if max_val - min_val <= limit:
                print(arr[start:end+1])

if __name__ == "__main__":
    n = int(input("Enter number of elements: "))
    arr = list(map(int, input("Enter the elements: ").split()))
    limit = int(input("Enter the allowed max-min difference: "))
    print_valid_subarrays(arr, limit)
