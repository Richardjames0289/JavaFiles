def ISBN(isbn):
    digit13 = 0
    for i in str(isbn): 
        if i == "-":
            pass
        else:
            if int(i)%2==0:
                digit13 = digit13 + int(i)
            else:
                digit13 = int(i)*3 + digit13
    rem = digit13%10
    result = 10-rem
    return result
print(ISBN(978-0-306-40615))