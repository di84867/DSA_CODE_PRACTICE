def switch_alphabet_cases_ascii(s):
    result = []
    for ch in s:
        ascii_val = ord(ch)
        if 'a' <= ch <= 'z':
            # Convert lowercase to uppercase by subtracting 32
            result.append(chr(ascii_val - 32))
        elif 'A' <= ch <= 'Z':
            # Convert uppercase to lowercase by adding 32
            result.append(chr(ascii_val + 32))
        else:
            result.append(ch)
            return ''.join(result)

s = input("Enter your String for ASCII conversion\n")
print("Converted String (ASCII logic):", switch_alphabet_cases_ascii(s))