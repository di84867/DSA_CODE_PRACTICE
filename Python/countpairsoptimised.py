def count_pairs_prefix_array():
    s = input("Enter the string: ")

    n = len(s)
    PA = [0] * n

    PA[0] = 0
    for i in range(1, n):
        PA[i] = PA[i - 1] + (1 if s[i - 1] == 'a' else 0)

    count = 0
    for i in range(n):
        if s[i] == 'g':
            count += PA[i]

    print("Number of (a, g) pairs:", count)


if __name__ == "__main__":
    count_pairs_prefix_array()
