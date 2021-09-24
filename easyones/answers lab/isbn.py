isbn = (input("ISBN?"))

digits = [int(x) for x in str(isbn)]

D1 = int(digits[0])
D2 = int(digits[1]) * 3 
D3 = int(digits[2])
D4 = int(digits[3]) * 3 
D5 = int(digits[4])
D6 = int(digits[5]) * 3 
D7 = int(digits[6])
D8 = int(digits[7]) * 3 
D9 = int(digits[8])
D10 = int(digits[9]) * 3 
D11 = int(digits[10])
D12 = int(digits[11]) * 3 

D13 = (10 - ((D1 + D2 + D3 + D4 + D5 + D6 +D7 + D8 +D9 + D10 + D11 +D12) % 10))

print((D13))







