def sort_descending(a):
    a.sort(reverse=True)

def calculate_cost(a):
    cost = 0
    for i in range(len(a)):
        cost += (i + 1) * a[i]
    return cost

def main():
    n = int(input("Enter number of elements: "))
    a = []
    print("Enter the elements:")
    for _ in range(n):
        a.append(int(input()))
    sort_descending(a)
    total_cost = calculate_cost(a)
    print("Total cost =", total_cost)

if __name__ == "__main__":
    main()
