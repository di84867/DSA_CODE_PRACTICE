def switch_alphabet_cases(s):
    result = []
    for ch in s:
        if 'a' <= ch <= 'z':
            result.append(ch.upper())
        elif 'A' <= ch <= 'Z':
            result.append(ch.lower())
        else:
            result.append(ch)
    return ''.join(result)

if __name__ == "__main__":
    s = input("Enter your String\n")
    converted = switch_alphabet_cases(s)
    print("Converted String:", converted)
