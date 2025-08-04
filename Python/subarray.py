def print_all_subarrays(arr):
    n = len(arr)
    print("All subarrays:")
    for start in range(n):
        for end in range(start, n):
            print(arr[start:end+1])

def main():
    n = int(input("Enter the number of elements in the array: "))
    print("Enter the elements separated by space:")
    arr = list(map(int, input().split()))
    
    if len(arr) != n:
        print("Warning: Number of elements entered does not match specified size.")
    
    print_all_subarrays(arr)

if __name__ == "__main__":
    main()
