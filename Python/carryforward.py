def count_pairs_carry_forward():
    s = input("Enter a string: ")
    x = input("Enter the first character (x) to find at i (i < j): ")
    y = input("Enter the second character (y) to find at j (j > i): ")

    count_x = 0
    pair_count = 0

    for char in s:
        if char == x:
            count_x += 1   
        elif char == y:
            pair_count += count_x 

    print(f"Number of ({x}, {y}) pairs: {pair_count}")

if __name__ == "__main__":
    count_pairs_carry_forward()
